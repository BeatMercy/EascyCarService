package beat.mercy.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import beat.mercy.common.util.RecognizePlate;
import beat.mercy.common.util.RestJsonResult;

@RestController
public class CarEnteranceController {

	@RequestMapping("/car/enter")
	public Map<String,Object> recognizeCar(MultipartFile file){
		try{
			List<String> result = RecognizePlate.recognizeFromImg(file);
			result.forEach(child->{
				System.err.println(child);
			});
			if(result.size()<1)
				return RestJsonResult.getErrorResult("检测失败：字符识别错误");
			return RestJsonResult.getSuccessResult(result,"检测成功");
		}catch (IOException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		
	}
}
