package beat.mercy.entity;

import javax.persistence.Entity;

@Entity
public class CarRepairOrder extends Order{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1416449722884362998L;
	
	private String engineNo;
	private String chassisNo;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
//	@ElementCollection(fetch=FetchType.EAGER)
//	@CollectionTable(name="order_map_repair_item")
//	@MapKeyColumn(name = "item_name")
//	public Map<String, Double> getRepairItems() {
//		return repairItems;
//	}
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
