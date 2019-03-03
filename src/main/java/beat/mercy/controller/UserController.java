package beat.mercy.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import beat.mercy.common.util.FileUtil;
import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.conf.security.UserPrincipal;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Order;
import beat.mercy.entity.Vehicle;
import beat.mercy.entity.base.Account;
import beat.mercy.entity.rbac.Authority;
import beat.mercy.entity.rbac.Role;
import beat.mercy.entity.state.LatestDateRange;
import beat.mercy.repository.AccountRepository;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.RoleRepository;
import beat.mercy.repository.VehicleRepository;
import beat.mercy.service.ICustomerTransactionService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class UserController {

	// private SteamIdAuthenticationService steamIdAuthService;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	VehicleRepository vehicleRepo;

	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPsswordEncoder;

	@Autowired
	private ICustomerTransactionService customerTransactionService;

	private String makeToken(Customer user) {

		Map<String, Object> map = new HashMap<>();
		List<String> s = new ArrayList<>();
		user.getRoles().forEach(role -> {
			role.getAuthorities().forEach((child) -> {
				s.add(child.getName());
			});
		});
		map.put("authorities", s.toArray());
		String token = Jwts.builder().setClaims(map).setSubject(user.getUsername())
				.setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 24 * 7 * 1000))// 有效期7天
				.signWith(SignatureAlgorithm.HS512, "MyJwtSecret").compact();
		return token;
	}

	@PostMapping(value = "/signup", consumes = "application/json;charset=UTF-8")
	public Map<String, Object> signUp(@RequestBody Customer customer) {
		Customer store = new Customer();
		if (customer.getRealName().trim().equals("")) {
			return RestJsonResult.getErrorResult("姓名填写错误");
		}
		if (customer.getUsername().trim().equals("") || customer.getPassword().trim().equals("")) {
			return RestJsonResult.getErrorResult("密码或用户名不合法");
		}
		if (customerRepository.findByUsername(customer.getUsername()) != null
				|| customerRepository.findByPhone(customer.getPhone()) != null) {
			return RestJsonResult.getErrorResult("该用户手机号已注册");
		}
		BeanUtils.copyProperties(customer, store);
		store.setPassword(bCryptPsswordEncoder.encode(customer.getPassword()));
		store.getRoles().add(roleRepo.getCustomerRole());
		customerRepository.save(store);

		return RestJsonResult.getSuccessResult(makeToken(store));

	}

	@RequestMapping(value = "/me", produces = "application/json;charset=UTF-8")
	public Map<String, Object> myInfo(Authentication auth) {
		Account account = accountRepository.findByUsername(auth.getName());
		List<String> authorities = new ArrayList<>();
		for (Role role : account.getRoles()) {
			for (Authority a : role.getAuthorities())
				authorities.add(a.getName());
		}
		Map<String,Object> result = new HashMap<>();
		result.put("user", account);
		result.put("authorities", authorities);
		return RestJsonResult.getSuccessResult(result, "success");
	}
	
	@RequestMapping(value = "/me/edit" ,produces = "application/json;charset=UTF-8")
	public String editMyInfo(Authentication auth, @RequestBody Account account) {
		Long userId = ((UserPrincipal)auth.getPrincipal()).getId();
		Account exist = accountRepository.findOne(userId);
		if(account.getWeixin() != null)
			exist.setWeixin(account.getWeixin());
		if(account.getQq() != null)
			exist.setQq(account.getQq());
		if(account.getRealName() != null)
			exist.setRealName(account.getRealName());
		if(account.getPhone()!=null&&!account.getPhone().equals(exist.getPhone())) {
			//修改手机和用户名
			exist.setPhone(account.getPhone());
		}
		try {
			accountRepository.save(exist);
		}catch(Exception e) {
			return JsonUtils.toJson(RestJsonResult.getErrorResult("手机号已存在！"));
		}
		
		return JsonUtils.toJson(RestJsonResult.getSuccessResult());
	}
	
	@RequestMapping(value = "/me/upload/headimg")
	public String uploadMyheadImg(Authentication auth , MultipartFile file) throws IOException {
		Long userId = ((UserPrincipal)auth.getPrincipal()).getId();
		String fileName = FileUtil.uploadFile(FileUtil.UPLOAD_ROOT_PATH+"/headimg/",file);
		Account user = accountRepository.findOne(userId);
		user.setHeadimg("img/headimg/"+fileName);
		accountRepository.save(user);
		return JsonUtils.toJson(RestJsonResult.getSuccessResult());
	}

	@RequestMapping(value = "/me/vehicles", produces = "application/json;charset=UTF-8")
	public Map<String, Object> myVehicles(Authentication auth) {
		return RestJsonResult.getSuccessResult(vehicleRepo.findByOwnerUsername(auth.getName()));
	}

	@RequestMapping(value = "/me/orders", produces = "application/json;charset=UTF-8")
	public Page<Order>  myOrders(Authentication auth, @RequestBody Map<String, Object> paramMap) {
		String dateRange = (String) paramMap.get("dateRange");
		Integer pageNum = (Integer) paramMap.get("pageNum");
		return customerTransactionService.findCustomerOrders(((UserPrincipal) auth.getPrincipal()).getId(),
						LatestDateRange.valueOf(dateRange), new PageableBuilder().buildPageNum(pageNum));

	}
	
	@RequestMapping(value = "/me/maintenanceRecord", produces = "application/json;charset=UTF-8")
	public Page<? extends Order> myMaintenanceRecord(Authentication auth, @RequestBody Map<String, Object> paramMap) {
		String dateRange = (String) paramMap.get("dateRange");
		Integer pageNum = (Integer) paramMap.get("pageNum");
		return customerTransactionService.findCustomerMaintenance(((UserPrincipal) auth.getPrincipal()).getId(),
				LatestDateRange.valueOf(dateRange), new PageableBuilder().buildPageNum(pageNum));
	}
	
	@RequestMapping(value = "/me/repairRecord", produces = "application/json;charset=UTF-8")
	public Page<? extends Order> myRepairRecord(Authentication auth, @RequestBody Map<String, Object> paramMap) {
		String dateRange = (String) paramMap.get("dateRange");
		Integer pageNum = (Integer) paramMap.get("pageNum");
		return customerTransactionService.findCustomerRepair(((UserPrincipal) auth.getPrincipal()).getId(),
				LatestDateRange.valueOf(dateRange), new PageableBuilder().buildPageNum(pageNum));
	}

	@RequestMapping(value = "/me/vehicle/bind", produces = "application/json;charset=UTF-8")
	public String bindCar(Authentication auth, @RequestBody Vehicle vehicle) {
		RestJsonResult result = null;
		try {
			result = customerTransactionService.bindCar(((UserPrincipal) auth.getPrincipal()).getId(), vehicle);
		} catch (IllegalArgumentException e) {
			return JsonUtils.toJson(new RestJsonResult().buildErrorResult(e.getMessage()));
		} 
		return JsonUtils.toJson(result);

	}

	@RequestMapping(value = "/me/vehicle/edit", produces = "application/json;charset=UTF-8")
	public String editCar(Authentication auth, @RequestBody Vehicle vehicle) {
		RestJsonResult result = null;
		try {
			result = customerTransactionService.editCar(((UserPrincipal) auth.getPrincipal()).getId(), vehicle);
		} catch (IllegalStateException | IllegalArgumentException e) {
			return JsonUtils.toJson(new RestJsonResult().buildErrorResult(e.getMessage()));
		}
		return JsonUtils.toJson(result);
	}

	@RequestMapping(value = "/me/vehicle/unbind")
	public String unbindCar(Authentication auth, Long vehicleId) {
		RestJsonResult result = null;
		try {
			result = customerTransactionService.unbindCar(((UserPrincipal) auth.getPrincipal()).getId(), vehicleId);
		} catch ( IllegalArgumentException e) {
			return JsonUtils.toJson(new RestJsonResult().buildErrorResult(e.getMessage()));
		}
		return JsonUtils.toJson(result);
	}

	// @RequestMapping("/goSteam")
	// public void goSteam(HttpServletRequest request,HttpServletResponse response){
	// String protocol="http://";
	// if(!request.getProtocol().equals("HTTP/1.1")) {
	// System.out.println(request.getProtocol());
	// protocol="https://";
	// }
	// String redirectUrl =
	// steamIdAuthService.tradeOpenId(protocol+request.getHeader("host")+"/steamAuth");
	// try {
	// response.sendRedirect(redirectUrl);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// @RequestMapping("/steamAuth")
	// public void steamAuth(HttpServletRequest request,HttpServletResponse
	// response){
	// steamIdAuthService.valdiateSteamAccount(request, response);
	// }
}