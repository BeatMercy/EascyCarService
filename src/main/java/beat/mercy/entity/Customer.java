package beat.mercy.entity;

import javax.persistence.Entity;
import javax.persistence.PrePersist;

import beat.mercy.entity.base.Account;

/**
 * 
 * @author Mercy Wu(a3049)
 * 2018年3月6日
 */
@Entity  
public class Customer extends Account{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8485303414462923589L;
	
	private Long comsumePoint;

	@PrePersist
	private void beforePersist() {
		this.comsumePoint=0L;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getComsumePoint() {
		return comsumePoint;
	}

	public void setComsumePoint(Long comsumePoint) {
		this.comsumePoint = comsumePoint;
	}
	
	
}
