package beat.mercy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	private Integer consumePoint;
	private Set<Vehicle> vehicles = new HashSet<Vehicle>();

	@PrePersist
	protected void beforePersist() {
		super.beforePersist();
		this.consumePoint=0;
	}

	public Integer getConsumePoint() {
		return consumePoint;
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}



	public void setConsumePoint(Integer consumePoint) {
		this.consumePoint = consumePoint;
	}
	
	
}
