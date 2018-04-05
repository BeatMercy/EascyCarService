package beat.mercy.entity;

import javax.persistence.Entity;

import beat.mercy.entity.base.BaseEntity;

@Entity
public class CarMaintenanceRecord extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3946071704016477596L;
	
	private String plateNo;
	private Double travelMiles;
	private Staff handleStaff;
	private Double price;
	private String note;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	
	public String getPlateNo() {
		return plateNo;
	}
	public Double getTravelMiles() {
		return travelMiles;
	}
	//---------------
	
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
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
