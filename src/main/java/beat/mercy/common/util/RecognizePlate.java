package beat.mercy.common.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.springframework.web.multipart.MultipartFile;

import beat.mercy.core.CharsRecognise;
import beat.mercy.core.PlateDetect;

import static org.bytedeco.javacpp.opencv_highgui.imread;

public class RecognizePlate {

	public static List<String> recognizeFromImg(MultipartFile file) throws IOException {
		Util.makeFloderDirectory(ServiceConst.TMP_DIR);
		String fileName = ServiceConst.TMP_DIR + file.getName();
		file.transferTo(new File(fileName));
		Mat src = imread(fileName);
		PlateDetect plateDetect = new PlateDetect();

		// 设置检测的环境参数
		plateDetect.setPDLifemode(false);

		Vector<Mat> matVector = new Vector<Mat>();

		Integer errCode = plateDetect.plateDetect(src, matVector);

		List<String> list = new ArrayList<>();

		if (0 == errCode) {
			CharsRecognise cr = new CharsRecognise();
			System.err.println("容器成功检测到车牌");
			System.err.println("待检测的数据:" + matVector.size());
			for (Mat mat : matVector) {
				String result = cr.charsRecognise(mat);
				if (result == null || result.equals("")) {
					System.err.println("容器 " + " 的字符无法识别");
				}
				list.add(result);
			}
			return list;
		} else if (errCode == -1) {
			// 容器中不包含车牌
			System.out.println("容器中有类车牌形状,但不包含车牌");
		} else {
			// 容器检测不到车牌
			System.out.println("容器中检测不到车牌");
		}

		// 返回空元素数组
		return new ArrayList<>();
	}
}