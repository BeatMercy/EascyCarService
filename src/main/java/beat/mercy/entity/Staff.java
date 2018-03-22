package beat.mercy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import beat.mercy.entity.base.Account;

@Entity
public class Staff extends Account{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5234105713816444039L;
	private Staff superior;//上司
	private List<Staff> subordinates;//下属
	
	
	//---------------自身一对多 多对一 ------------
	@ManyToOne(cascade=CascadeType.ALL)
	public Staff getSuperior() {
		return superior;
	}
	
	@OneToMany(mappedBy="superior",cascade=CascadeType.ALL)
	public List<Staff> getSubordinates() {
		return subordinates;
	}
	//---------------------------------------------------
	
	public void setSuperior(Staff superior) {
		this.superior = superior;
	}
	public void setSubordinates(List<Staff> subordinates) {
		this.subordinates = subordinates;
	}
}
