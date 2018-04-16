package beat.mercy.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.conf.security.UserPrincipal;
import beat.mercy.entity.Customer;
import beat.mercy.entity.base.Account;
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

		return RestJsonResult.getSuccessResult(account, "success");
	}

	@RequestMapping(value = "/me/vehicles", produces = "application/json;charset=UTF-8")
	public Map<String, Object> myVehicles(Authentication auth) {
		return RestJsonResult.getSuccessResult(vehicleRepo.findByOwnerUsername(auth.getName()));
	}

	@RequestMapping(value = "/me/orders", produces = "application/json;charset=UTF-8")
	public Map<String, Object> myOrders(Authentication auth, @RequestBody Map<String, Object> paramMap) {
		String dateRange = (String) paramMap.get("dateRange");
		Integer pageNum = (Integer) paramMap.get("pageNum");
		return RestJsonResult.getSuccessResult(
				customerTransactionService.findCustomerOrders(
						((UserPrincipal) auth.getPrincipal()).getId(),
						LatestDateRange.valueOf(dateRange),
						new PageableBuilder().buildPageNum(pageNum)
						)
				);

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