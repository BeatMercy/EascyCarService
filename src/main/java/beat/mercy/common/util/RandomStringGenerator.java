package beat.mercy.common.util;

import java.util.Date;
import java.util.Random;

public class RandomStringGenerator {

	/**
	 * 生成随机字符串 author: Mercy Wu(a3049) 2018年2月25日 下午7:55:05
	 * 
	 * @param length
	 *            length表示生成字符串的长度
	 * @return
	 */
	public static String getRandomString(int length) {
		String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
	
	/**
	 * 生成19位数字 日期+6位随机数字(1520403582999+6 number)
	 * author: Mercy Wu(a3049)
	 * 2018年3月7日 下午2:18:32
	 * @return
	 */
	public static String getOrderNo() {
		Date now = new Date();
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		sb.append(now.getTime());
//		sb.append("+");
		for (int i = 0; i < 6; i++) {
			int number = random.nextInt(9);
			sb.append(number);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		for(int i =0 ; i<100;i++)
		System.err.println(getOrderNo());
	}
	
}
