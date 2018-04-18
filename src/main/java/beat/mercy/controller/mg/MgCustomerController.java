package beat.mercy.controller.mg;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.entity.Customer;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.VehicleRepository;

@RestController
@RequestMapping("/mg")
@Secured({"ROLE_ADMIN"})
public class MgCustomerController {

	@Autowired
	CustomerRepository customerRepo;
	@Autowired
	VehicleRepository vehicleRepo;

	@GetMapping("/users")
	public Page<Customer> getAllCustomer(String keyword,PageableBuilder pageableBuilder){
		if(keyword.trim().isEmpty()) {
			return customerRepo.findAll(pageableBuilder.getPageable());
		}
		keyword+="%";
		return customerRepo.findByPhoneLikeOrRealNameLikeOrWeixinLike(keyword, keyword, keyword, pageableBuilder.getPageable());
	}
	@GetMapping("/user/disable")
	public Map<String,Object> disableUser(Long id){
		Customer user = customerRepo.findOne(id);
		if(user==null) {
			return RestJsonResult.getErrorResult("查无此人");
		}
		user.setEnabled(false);
		customerRepo.save(user);
		return RestJsonResult.getSuccessResult();
	}
	
	@GetMapping("/user/enable")
	public Map<String,Object> enableUser(Long id){
		Customer user = customerRepo.findOne(id);
		if(user==null) {
			return RestJsonResult.getErrorResult("查无此人");
		}
		user.setEnabled(false);
		customerRepo.save(user);
		return RestJsonResult.getSuccessResult();
	}
	
	@GetMapping("/user/vehicles")
	public Map<String,Object> userVehicles(Long id){
		return RestJsonResult.getSuccessResult(vehicleRepo.findByOwnerId(id));
	}
}
