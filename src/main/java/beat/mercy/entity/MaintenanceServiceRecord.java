package beat.mercy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import beat.mercy.entity.base.BaseEntity;

@Entity
@Table(name="maintenance_service_record")
public class MaintenanceServiceRecord extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3946071704016477596L;
	
	private Vehicle targetVehicle;
	private Staff handleStaff;
	private Double price;
	private String note;
	
	public Vehicle getTargetVehicle() {
		return targetVehicle;
	}
	public Staff getHandleStaff() {
		return handleStaff;
	}
	public Double getPrice() {
		return price;
	}
	public String getNote() {
		return note;
	}
	
	//---------------
	
	public void setTargetVehicle(Vehicle targetVehicle) {
		this.targetVehicle = targetVehicle;
	}
	public void setHandleStaff(Staff handleStaff) {
		this.handleStaff = handleStaff;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
