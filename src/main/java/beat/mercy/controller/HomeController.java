package beat.mercy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.entity.Advertisement;
import beat.mercy.entity.base.BaseCarService;
import beat.mercy.repository.CarServiceRepository;
import beat.mercy.service.IContentMgService;

@RestController
@CrossOrigin(origins="hyyp://localhost:4200")
public class HomeController {

	@Autowired
	private CarServiceRepository carServiceRepository;
	
	@Autowired
	private IContentMgService contentMgService;
	
	@RequestMapping("home/product/all")
	public List<BaseCarService> findAllService(){
		return carServiceRepository.findAll();
	}
	
	@RequestMapping("home/product/findFromHome")
	public List<BaseCarService> findFromHome(String keyword){
		return carServiceRepository.findByNameLike(keyword+"%");
	}
	
	@RequestMapping("/home/carousel")
	public List<Advertisement> findHomeCarousel(){
		return contentMgService.findHomeCarousel();
	}
}
