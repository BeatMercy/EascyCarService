package beat.mercy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beat.mercy.common.util.FileUtil;

@Controller
public class ResourceController {

	
	@RequestMapping("/img/{type}/{id}")
	public ResponseEntity<byte[]> imgRetrieve(
			@PathVariable(name="type") String type,
			@PathVariable(name="id") String id){
		String filePath = FileUtil.UPLOAD_ROOT_PATH+"/"+type+"/"+id;
		return FileUtil.downloadFile(filePath);
	}
}
