package beat.mercy.common.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by L.cm Date: 2015-25-12 17:57
 */
public final class JsonUtils {
	private JsonUtils() {
	}

	/**
	 * 将对象序列化成json字符串
	 * 
	 * @param object
	 *            javaBean
	 * @return jsonString json字符串
	 */
	public static String toJson(Object object) {
		try {
			return getInstance().writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将json反序列化成对象
	 * 
	 * @param jsonString
	 *            jsonString
	 * @param valueType
	 *            class
	 * @param <T>
	 *            T 泛型标记
	 * @return Bean
	 */
	public static <T> T parse(String jsonString, Class<T> valueType) {
		try {
			return getInstance().readValue(jsonString, valueType);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将经SpingMVC转化后的json字符串转换为指定类型 author: Mercy Wu(a3049) 2018年3月11日 上午12:31:09
	 * 
	 * @param map
	 * @param valueType
	 * @return
	 */
	public static <T> T getObjectFromMap(Object map, Class<T> valueType) {
		try {
			return getInstance().readValue(toJson(map), valueType);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static ObjectMapper getInstance() {
		return JacksonHolder.INSTANCE;
	}

	private static class JacksonHolder {
		private static ObjectMapper INSTANCE = new JacksonObjectMapper();
	}

}
