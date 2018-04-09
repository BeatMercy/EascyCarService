package beat.mercy.common.exception;

public class OrderTransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5454575083315301258L;
	private String message;

	public OrderTransactionException(String Message) {
		this.message= Message;
	}

	@Override
	public String getMessage() {

		return "订单创建异常：" + this.message;

	}
}
