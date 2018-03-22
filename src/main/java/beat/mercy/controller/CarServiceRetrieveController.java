package beat.mercy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.entity.base.BaseCarService;
import beat.mercy.repository.CarServiceRepository;

@RestController
public class CarServiceRetrieveController {

	@Autowired
	private CarServiceRepository carServiceRepository;
	
	@RequestMapping("home/product/all")
	public List<BaseCarService> findAllService(){
		return carServiceRepository.findAll();
	}
}
