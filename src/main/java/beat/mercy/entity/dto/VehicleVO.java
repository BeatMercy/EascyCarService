package beat.mercy.entity.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import beat.mercy.entity.Vehicle;
import beat.mercy.entity.state.FuseType;
import beat.mercy.entity.state.VehicleType;

public class VehicleVO {
	
	protected Long id;
	protected Date createTime;
	protected Date updateTime;
	private String brand; // 品牌
	private String plateNo;
	private Date broughtDate;
	private VehicleType vehicleType;
	private FuseType fuseType;
	private Double travelMiles;
	private String engineNo;
	private String chassisNo;
	private String ownerRealName;

	public VehicleVO() {
	}

	public VehicleVO(Vehicle v) {
		BeanUtils.copyProperties(v, this);
		if (v.getOwner() != null) {
			this.ownerRealName = v.getOwner().getRealName();
		}

	}

	public Long getId() {
		return id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

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

	public Double getTravelMiles() {
		return travelMiles;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public String getOwnerRealName() {
		return ownerRealName;
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

	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public void setOwnerRealName(String ownerRealName) {
		this.ownerRealName = ownerRealName;
	}
	
}
