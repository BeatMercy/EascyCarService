package beat.mercy.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.RecognizePlate;
import beat.mercy.common.util.RestJsonResult;

@RestController
public class CarEnteranceController {

	@RequestMapping("/car/enter")
	public Map<String, Object> recognizeCar(MultipartFile file) {
		try {
			List<String> result = RecognizePlate.recognizeFromImg(file);
			result.forEach(child -> {
				System.err.println(child);
			});
			if (result.size() < 1)
				return RestJsonResult.getErrorResult("检测失败：字符识别错误");
			return RestJsonResult.getSuccessResult(result, "检测成功");
		} catch (IOException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}

	}

	/**
	 * 订单提交时使用的车牌识别 author: Mercy Wu(a3049) 2018年4月7日 上午1:08:03
	 * 
	 * @param file
	 * @return
	 */
	@Secured({ "ROLE_STAFF" })
	@RequestMapping("/plate-recognize/order")
	public String recognizePlate(MultipartFile file) {
		try {
			List<String> result = RecognizePlate.recognizeFromImg(file);
			result.forEach(child -> {
				System.err.println(child);
			});
			if (result.size() < 1)
				return JsonUtils.toJson(RestJsonResult.getErrorResult("检测失败：字符识别错误"));
			Map<String, String> plateMap = new HashMap<>();
			plateMap.put("plateAbbr", result.get(0).substring(0, 1));
			plateMap.put("plateString", result.get(0).substring(1));
			return JsonUtils.toJson(RestJsonResult.getSuccessResult(plateMap, ""));
		} catch (IOException e) {
			return JsonUtils.toJson(RestJsonResult.getErrorResult(e.getMessage()));
		}
	}
}
