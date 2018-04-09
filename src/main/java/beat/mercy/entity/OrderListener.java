package beat.mercy.entity;

import javax.persistence.PrePersist;

import beat.mercy.common.util.RandomStringGenerator;

public class OrderListener {

	@PrePersist
	public void pre(Order order) {
		if (order.getOrderNo() == null) {
			order.setOrderNo("un" + RandomStringGenerator.getOrderNo());
		}
	}
}
