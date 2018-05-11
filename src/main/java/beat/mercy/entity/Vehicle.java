package beat.mercy.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import beat.mercy.entity.base.BaseEntity;
import beat.mercy.entity.state.FuseType;
import beat.mercy.entity.state.VehicleType;

@Entity
@Table(name="vehicle")
public class Vehicle extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2071448734948345245L;
	private String brand;	// 品牌
	private String plateNo;
	private Date broughtDate;
	private VehicleType vehicleType;
	private FuseType fuseType;
	private Double travelMiles;
	private String engineNo;
	private String chassisNo;
	private Customer owner;

	public String getBrand() {
		return brand;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public Date getBroughtDate() {
		return broughtDate;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public FuseType getFuseType() {
		return fuseType;
	}

	@JsonIgnore
	@ManyToOne
	public Customer getOwner() {
		return owner;
	}
	public Double getTravelMiles() {
		return travelMiles;
	}
	//----------------------

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public void setBroughtDate(Date broughtDate) {
		this.broughtDate = broughtDate;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setFuseType(FuseType fuseType) {
		this.fuseType = fuseType;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	
	
}
