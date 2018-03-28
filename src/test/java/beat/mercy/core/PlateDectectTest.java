package beat.mercy.core;


import static org.bytedeco.javacpp.opencv_highgui.imread;

import java.util.Vector;

import org.bytedeco.javacpp.opencv_core.Mat;
import org.junit.Test;

import beat.mercy.core.CharsRecognise;
import beat.mercy.core.PlateDetect;

public class PlateDectectTest {

	@Test
	public void plateDetectTest() {
		// 由于资源路径放置在sourceFloder 所以编译的时候src目录下的所有文件都会生成到target目录中
		// 通过classpathResource 类来获取target目录下的文件
		/*ClassPathResource imgRes = new ClassPathResource("/img/plate.jpg");
		Mat src = new Mat();
		try {
			if (imgRes.exists())
				System.out.println("Image Read Success! ");
			else
				throw new Exception("File not found");
			String absolutePath = imgRes.getFile().getAbsolutePath();
			src = imread(absolutePath);
		} catch (Exception e) {
			System.out.println("IOException");
		}*/
		
		/*当以下错误发生则是图片路径错误为主(不要包含中文)
		*Error : Assertion failed (scn == 3 || scn == 4) in cv::cvtColor
		*/
//		Mat src = imread("res/image/general_test/浙B7C289.jpg");
		Mat src = imread("res/image/test_image/test4.jpg");
		
		PlateDetect plateDetect = new PlateDetect();

		// 设置检测的环境参数
		plateDetect.setPDLifemode(false);

		Vector<Mat> matVector = new Vector<Mat>();

		Integer errCode = plateDetect.plateDetect(src, matVector);

		if (0 == errCode) {
			CharsRecognise cr = new CharsRecognise();
			System.err.println("容器成功检测到车牌");
			System.err.println("待检测的数据:" + matVector.size());
			for (int i = 0; i < matVector.size(); ++i) {
				String result = cr.charsRecognise(matVector.get(i));
				if (result == null || result.equals("")) {
					System.err.println("容器 " + i + " 的字符无法识别");
				}
				System.out.println("容器" + i + "车牌:" + result);
			}
		} else if (errCode == -1) {
			// 容器中不包含车牌
			System.out.println("容器中有类车牌形状,但不包含车牌");
		} else {
			// 容器检测不到车牌
			System.out.println("容器中检测不到车牌");
		}

	}
	
}
