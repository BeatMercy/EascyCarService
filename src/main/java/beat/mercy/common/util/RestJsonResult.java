package beat.mercy.common.util;


import java.util.HashMap;
import java.util.Map;

public class RestJsonResult {

	private static final String CODE_KEY = "code";
	private static final String DATA_KEY = "content";
	private static final String MSG_KEY = "msg";
	
	private Boolean success;
	private Object content;
	private String msg;
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return success;
	}

	public Object getContent() {
		return content;
	}

	public String getMsg() {
		return msg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RestJsonResult buildResult(boolean success, Object content, String msg) {
		this.success = success;
		this.content = content;
		this.msg = msg;
		this.code = "0";
		return this;
	}

	public RestJsonResult buildSuccessResult(Object content, String msg) {
		this.success = true;
		this.content = content;
		this.msg = msg;
		this.code = "0";
		return this;
	}

	public RestJsonResult buildSuccessResult(Object content) {
		this.success = true;
		this.content = content;
		this.msg = "执行成功";
		this.code = "0";
		return this;
	}
	public RestJsonResult buildErrorResult() {
		this.success = false;
		this.content = null;
		this.msg = "执行失败";
		this.code = "-1";
		return this;
	}
	
	public RestJsonResult buildErrorResult(String msg) {
		this.success = false;
		this.content = null;
		this.msg = msg;
		this.code = "-1";
		return this;
	}
	
	public RestJsonResult buildErrorResult(String code,String msg) {
		this.success = false;
		this.content = null;
		this.msg = msg;
		this.code = code;
		return this;
	}
	public Map<String,Object> toMap(){
		if(this.code==null)
			this.code="0";
		return getMapResult(this.code, this.content, this.msg);
	}

	
	

	/**
	 * 取得执行成功的返回
	 */
	public static Map<String, Object> getSuccessResult() {
		return getMapResult("0", null, "执行成功");
	}

	/**
	 * 取得执行成功的返回
	 * 
	 * @param data
	 * @param msg
	 * @return
	 */
	public static <T> Map<String, Object> getSuccessResult(T data, String msg) {
		return getMapResult("0", data, msg);
	}

	public static <T> Map<String, Object> getSuccessResult(T data) {
		return getMapResult("0", data, "执行成功");
	}

	/**
	 * 取得执行失败的返回
	 * 
	 * @param code
	 *            错误码不可为"0"
	 * @param errDesc
	 * @return
	 */
	public static Map<String, Object> getErrorResult(String code, String errDesc) {
		return getMapResult(code, null, errDesc);
	}

	public static Map<String, Object> getErrorResult(String errDesc) {
		return getMapResult("-1", null, errDesc);
	}

	/**
	 * 
	 * @param code
	 *            成功则为0
	 * @param data
	 * @param msg
	 * @return
	 */
	public static <T> Map<String, Object> getMapResult(String code, T data, String msg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", code.equals("0") ? true : false);
		map.put(DATA_KEY, (data == null) ? "" : data);
		map.put(MSG_KEY, (msg == null) ? "" : msg);
		if(!code.equals("0"))
			map.put(CODE_KEY, code);
		return map;
	}

}
