package beat.mercy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import beat.mercy.entity.base.BaseCarService;

@Entity
public class ServiceOrder extends Order {
	
	private List<BaseCarService> orderServices;

	@OneToMany(cascade= {CascadeType.REFRESH,CascadeType.DETACH})
	public List<BaseCarService> getOrderServices() {
		return orderServices;
	}

	public void setOrderServices(List<BaseCarService> orderServices) {
		this.orderServices = orderServices;
	}
	
}
