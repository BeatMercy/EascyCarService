package beat.mercy.common.exception;

public class AccountTransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5454575083315301258L;
	private String message;

	public AccountTransactionException(String Message) {
		this.message= Message;
	}

	@Override
	public String getMessage() {

		return "账户异常：" + this.message;

	}
}
