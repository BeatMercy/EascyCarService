package beat.mercy.controller.mg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Department;
import beat.mercy.repository.DepartmentRepository;

@RestController
@RequestMapping("/mg")
public class MgDepartmentController {

	@Autowired
	public DepartmentRepository departmentRepo;
	
	@GetMapping("/departments")
	public List<Department> departments(String keyword,PageableBuilder pageableBuilder){
		
		if(keyword==null||keyword.trim().isEmpty())
			return departmentRepo.findAll();
		
		return departmentRepo.findByNameLike(keyword+"%");
	}
}
