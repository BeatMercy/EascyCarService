package beat.mercy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import beat.mercy.entity.base.Account;

@Entity
public class Staff extends Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5234105713816444039L;

	private Department department;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.REFRESH })
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
