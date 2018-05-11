package beat.mercy.controller.mg;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.entity.option.SelectOption;
import beat.mercy.repository.SelectOptionRepository;

@RestController
@RequestMapping("/mg")
@Secured({"ROLE_ADMIN"})
public class MgServiceOptionController {

	@Autowired
	SelectOptionRepository optionRepo;
	
	@GetMapping("/service/options")
	public Page<SelectOption> getOptionById(String serviceType,String keyword,PageableBuilder pageableBuilder){
		if(keyword==null||keyword.trim().isEmpty()) {
			return optionRepo.findByServiceType(serviceType,pageableBuilder.getPageable());
		}
		return optionRepo.findByServiceTypeAndKeyword(serviceType, "%"+keyword+"%", pageableBuilder.getPageable());
	}
	
	@PostMapping("/service/option/add")
	public Map<String, Object> addOne(@RequestBody Map<String,Object> paramMap){
		List<Map<String, Object>> inputFields = (List<Map<String, Object>>) paramMap.get("inputFields");
		SelectOption option =new SelectOption();
		option.setName(String.valueOf(inputFields.get(0).get("value")));
		option.setItemName(String.valueOf(inputFields.get(1).get("value")));
		option.setPrice(Double.valueOf(String.valueOf(inputFields.get(2).get("value"))));
		Object serviceType = ((Map)paramMap.get("data")).get("serviceType");
		option.setServiceType(String.valueOf(serviceType));
		if(option.getName()==null||option.getName().trim().isEmpty())
			return RestJsonResult.getErrorResult("选项名设置不合法");
		if(option.getItemName()==null||option.getItemName().trim().isEmpty())
			return RestJsonResult.getErrorResult("选项所属的类型名设置不合法");
		if(option==null||option.getPrice()<0)
			return RestJsonResult.getErrorResult("价格设置不合法");
		optionRepo.save(option);
		return RestJsonResult.getSuccessResult();
	}
	
	@PostMapping("/service/option/edit")
	public Map<String, Object> editOne(@RequestBody Map<String,Object> paramMap){
		List<Map<String, Object>> inputFields = (List<Map<String, Object>>) paramMap.get("inputFields");
		SelectOption option =new SelectOption();
		option.setId(((Integer)inputFields.get(0).get("value")).longValue());
		option.setItemName(String.valueOf(inputFields.get(1).get("value")));
		option.setName(String.valueOf(inputFields.get(2).get("value")));
		option.setPrice(Double.valueOf(String.valueOf(inputFields.get(3).get("value"))));
		Object serviceType = ((Map)paramMap.get("data")).get("serviceType");
		option.setServiceType(String.valueOf(serviceType));
		
		if(option.getId()==null)
			return RestJsonResult.getErrorResult("选项id不可为空");
		if(option==null||option.getPrice()<0)
			return RestJsonResult.getErrorResult("价格设置不合法");
		SelectOption original = optionRepo.findOne(option.getId());
		BeanUtils.copyProperties(option, original, "id", "createTime","updateTime","dtype","enable");
		optionRepo.save(original);
		return RestJsonResult.getSuccessResult();
	}
	
	@GetMapping("/service/option/disable")
	public Map<String, Object> disableUser(Long id) {
		SelectOption user = optionRepo.findOne(id);
		if (user == null) {
			return RestJsonResult.getErrorResult("查无此选项");
		}
		user.setEnable(false);
		optionRepo.save(user);
		return RestJsonResult.getSuccessResult();
	}

	@GetMapping("/service/option/enable")
	public Map<String, Object> enableUser(Long id) {
		SelectOption user = optionRepo.findOne(id);
		if (user == null) {
			return RestJsonResult.getErrorResult("查无此选项");
		}
		user.setEnable(true);
		optionRepo.save(user);
		return RestJsonResult.getSuccessResult();
	}
	
	
}
