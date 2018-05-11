package beat.mercy.controller.mg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.entity.Department;
import beat.mercy.entity.Staff;
import beat.mercy.repository.OrderRepository;
import beat.mercy.repository.RoleRepository;
import beat.mercy.repository.StaffRepository;

@RestController
@RequestMapping("/mg")
@Secured({ "ROLE_ADMIN" })
public class MgStaffController {

	@Autowired
	StaffRepository staffRepo;

	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPsswordEncoder;

	/**
	 * 增加员工
	 * author: Mercy Wu(a3049)
	 * 2018年4月23日 下午6:29:38
	 * @param requestMap
	 * @return
	 */
	@PostMapping("/staff/add")
	public Map<String, Object> addStaff(@RequestBody Map<String, Object> requestMap) {
		Long departmentId = Long.valueOf(String.valueOf(requestMap.get("departmentId")));
		requestMap.remove("departmentId");
		Staff newStaff = JsonUtils.getObjectFromMap(requestMap, Staff.class);
		if (newStaff.getRealName().isEmpty() || newStaff.getPhone().isEmpty()) {
			return RestJsonResult.getErrorResult("用户信息缺少：姓名或者手机号");
		}
		
		if (departmentId != null) {
			Department d = new Department();
			d.setId(departmentId);
			newStaff.setDepartment(d);
		}
		newStaff.setUsername(newStaff.getPhone());
		newStaff.setPassword(bCryptPsswordEncoder.encode(newStaff.getPassword()));
		newStaff.getRoles().add(roleRepo.getStaffRole());
		staffRepo.save(newStaff);
		return RestJsonResult.getSuccessResult();
	}
	
	@PostMapping("/staff/edit")
	public Map<String, Object> editStaff(@RequestBody Map<String, Object> requestMap) {
		Long departmentId = Long.valueOf(String.valueOf(requestMap.get("departmentId")));
		requestMap.remove("departmentId");
		
		Staff newStaff = JsonUtils.getObjectFromMap(requestMap, Staff.class);
		if(newStaff.getId()==null) {
			return RestJsonResult.getErrorResult("缺少id");
		}
		if (newStaff.getRealName().isEmpty() || newStaff.getPhone().isEmpty()) {
			return RestJsonResult.getErrorResult("用户信息缺少：姓名或者手机号");
		}
		Staff exist = staffRepo.findOne(newStaff.getId());
		exist.setPhone(newStaff.getPhone());
		exist.setWeixin(newStaff.getWeixin());
		exist.setRealName(newStaff.getRealName());
		if (departmentId != null) {
			Department d = new Department();
			d.setId(departmentId);
			exist.setDepartment(d);
		}
		
		staffRepo.save(exist);
		return RestJsonResult.getSuccessResult();
	}
	
	@GetMapping("/staff/roles")
	public Map<String, Object> getStaffRoles(Long staffId){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("all",roleRepo.findAll());
		result.put("staff", roleRepo.findByUsersId(staffId));
		return RestJsonResult.getSuccessResult(result);
		
	}
	
	/**
	 * 员工权限删除
	 * author: Mercy Wu(a3049)
	 * 2018年4月23日 下午6:29:12
	 * @param staffId
	 * @param roleId
	 * @return
	 */
	@GetMapping("/staff/role/delete")
	@Transactional
	public Map<String,Object> addStaffRole(Long staffId,Long roleId){
		Staff staff = staffRepo.findOne(staffId);
		staff.setRoles(
				staff.getRoles().stream()
					.filter(set -> !set.getId().equals(roleId))
						.collect(Collectors.toSet()));
		staffRepo.save(staff);
		return RestJsonResult.getSuccessResult();
	}
	
	/**
	 * 员工权限添加
	 * author: Mercy Wu(a3049)
	 * 2018年4月23日 下午6:29:27
	 * @param staffId
	 * @param roleId
	 * @return
	 */
	@GetMapping("/staff/role/add")
	@Transactional
	public Map<String,Object> deleteStaffRole(Long staffId,Long roleId){
		Staff staff = staffRepo.findOne(staffId);
		staff.getRoles().add(roleRepo.findOne(roleId));
		staffRepo.save(staff);
		return RestJsonResult.getSuccessResult();
	}
	

	@GetMapping("/staffs")
	public Page<Staff> getAllStaff(String keyword, PageableBuilder pageableBuilder) {
		if (keyword.trim().isEmpty()) {
			return staffRepo.findAll(pageableBuilder.getPageable());
		}
		keyword += "%";
		return staffRepo.findByPhoneLikeOrRealNameLikeOrWeixinLike(keyword, keyword, keyword,
				pageableBuilder.getPageable());
	}

	@GetMapping("/staff/disable")
	public Map<String, Object> disableUser(Long id) {
		Staff user = staffRepo.findOne(id);
		if (user == null) {
			return RestJsonResult.getErrorResult("查无此人");
		}
		user.setEnabled(false);
		staffRepo.save(user);
		return RestJsonResult.getSuccessResult();
	}

	@GetMapping("/staff/enable")
	public Map<String, Object> enableUser(Long id) {
		Staff user = staffRepo.findOne(id);
		if (user == null) {
			return RestJsonResult.getErrorResult("查无此人");
		}
		user.setEnabled(true);
		staffRepo.save(user);
		return RestJsonResult.getSuccessResult();
	}

	@GetMapping("/staff/latestmonth-orders")
	public Map<String, Object> userVehicles(Long id, PageableBuilder pageableBuilder) {
		try {
			Calendar calendar = Calendar.getInstance();
			Date today = new Date();
			calendar.setTime(today);
			String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
			if (month.length() < 2) {
				month = "0" + month;
			}
			int year = calendar.get(Calendar.YEAR);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date afterDate = sdf.parse(year + "/" + month + "/01");
			System.err.println(afterDate);
			return RestJsonResult.getSuccessResult(orderRepo
					.findByStaffIdAndCreateTimeAfter(id, afterDate, pageableBuilder.getPageable()).getContent());
		} catch (Exception e) {
			e.printStackTrace();
			return RestJsonResult.getErrorResult(e.getMessage());
		}
	}

}
