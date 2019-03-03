package beat.mercy.controller.mg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Vehicle;
import beat.mercy.entity.dto.VehicleVO;
import beat.mercy.repository.VehicleRepository;

@RestController
public class MgVehicleController {

	@Autowired
	VehicleRepository vehicelRepo;
	
	@RequestMapping("/mg/vehicle/all")
	public Page<VehicleVO> findVehicle(String keyword,PageableBuilder pageableBuilder) {
		if(keyword==null||keyword.trim().isEmpty()) {
			return vehicelRepo.findAll(pageableBuilder.getPageable()).map(VehicleVO::new);
		}
		return vehicelRepo.findByPlateNoLikeOrBrandLikeOrOwnerRealNameLike("%"+keyword+"%", "%"+keyword+"%" , "%"+keyword+"%", pageableBuilder.getPageable()).map(VehicleVO::new);
	}
	
}
