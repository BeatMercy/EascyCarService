package beat.mercy.entity.state;

public enum ServiceProgress {
	PENDING,
	WORKING,
	
	FINISHED,
	/**
	 * 等待车主验收
	 */
	WAITING_CONFIRM
}
