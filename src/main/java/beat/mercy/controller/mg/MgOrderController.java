package beat.mercy.controller.mg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Order;
import beat.mercy.repository.OrderRepository;

@RestController
@RequestMapping("/mg")
@Secured({ "ROLE_ADMIN" })
public class MgOrderController {

	@Autowired
	OrderRepository orderRepo;
	
	@RequestMapping("/order/all" )
	public Page<Order> findAll(String serviceType,String keyword,PageableBuilder pageableBuilder) {
		if(keyword==null||keyword.trim().isEmpty()) {
			return orderRepo.findByType(serviceType,pageableBuilder.getPageable());
		}
		return orderRepo.findByTypeAndKeyword(serviceType, "%"+keyword+"%", pageableBuilder.getPageable());
	}
	
}
