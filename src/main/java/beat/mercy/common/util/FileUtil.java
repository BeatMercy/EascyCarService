package beat.mercy.common.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	public static final String ROOT_PATH = "D:/EasyCarService";

	public static final String UPLOAD_ROOT_PATH = "D:/EasyCarService/upload";

	private static String makeFloderDirectory(String floderPath) {
		if (!floderPath.startsWith(UPLOAD_ROOT_PATH)) {
			System.err.println("非项目文件路径！");
			return null;
		}
		File directory = new File(floderPath);
		if (!directory.exists()) {
			directory.mkdirs();
		}
		return floderPath;
	}

	public static ResponseEntity<byte[]> downloadFile(String filePath) throws IOException {
		String fileName = filePath.substring(filePath.lastIndexOf('/') + 1);
		File file = new File(filePath);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		try {
			return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
		} catch (IOException e) {
			// e.printStackTrace();
			System.err.println("文件下载异常：：" + e.getMessage());
			throw e;
		}
	}

	public static String uploadFile(String filePath, MultipartFile file) throws IOException {
		
		makeFloderDirectory(filePath);
		String fileName ="";
		if(!filePath.endsWith("/")) {
			fileName = filePath.substring(filePath.lastIndexOf('/') + 1,
					filePath.contains(".") ? filePath.lastIndexOf(".") : filePath.length());	
		}else {
			fileName = file.getName();
		}
		fileName = fileName + "-" + UUID.randomUUID().toString().substring(0, 10);
		file.transferTo(new File(filePath+fileName));
		return fileName;

	}
}
