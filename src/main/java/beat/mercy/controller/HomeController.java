package beat.mercy.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import beat.mercy.entity.Advertisement;
import beat.mercy.entity.base.BaseCarService;
import beat.mercy.repository.CarServiceRepository;
import beat.mercy.service.IContentMgService;

@RestController
@CrossOrigin(origins = "hyyp://localhost:4200")
public class HomeController {

	@Autowired
	private CarServiceRepository carServiceRepository;

	@Autowired
	private IContentMgService contentMgService;

	@RequestMapping("home/product/all")
	public List<BaseCarService> findAllService() {
		return carServiceRepository.findAll();
	}

	@RequestMapping("home/product/findFromHome")
	public Set<BaseCarService> findFromHome(String keyword) {
		Set<BaseCarService> result = new HashSet<>();
		if (keyword == null || keyword.equals(" ")) {
			// TODO 返回推荐
			// System.out.println("返回推荐内容");
			result.addAll(carServiceRepository.findAll());
			return result;
		}
		
		result.addAll(carServiceRepository.findByTags(keyword.trim()));
		
		String keywords[] = keyword.split(" ");
		keyword = String.join("%", keywords);
		System.out.println("查询的关键字：" + keyword);
		result.addAll(carServiceRepository.findByNameLike(keyword + "%"));
		return result;
	}

	@RequestMapping("/home/carousel")
	public List<Advertisement> findHomeCarousel() {
		return contentMgService.findHomeCarousel();
	}
}
