package beat.mercy.common.util;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonResult{
    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(){{
			    put("status", status);
			    put("message", message);
			    put("result", result);
			}};
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return jsonObject.toString();
    }
    
    private static Map<String,Object> jsonResultMap(Integer status, String message, Object content){
    	Map<String , Object> result = new HashMap<>();
    	result.put("status", status);
    	result.put("message", message);
    	result.put("content", content);
    	return result;
    }
    
    public static Map<String,Object> successJsonResultMap(Object content){
    	return jsonResultMap(0, "success", content);
    }
    public static Map<String,Object> successJsonResultMap(String message,Object content){
    	return jsonResultMap(0, message, content);
    }
    public static Map<String,Object> successJsonResultMap(Integer status,String message,Object content){
    	return jsonResultMap(status, message, content);
    }
    public static Map<String,Object> failureJsonResultMap(Object content){
    	return jsonResultMap(-1, "success", content);
    }
    public static Map<String,Object> failureJsonResultMap(String message,Object content){
    	return jsonResultMap(-1, message, content);
    }
    public static Map<String,Object> failureJsonResultMap(Integer status,String message,Object content){
    	return jsonResultMap(status, message, content);
    }
}