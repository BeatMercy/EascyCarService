package beat.mercy.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapKeyColumn;

//@Entity
public class CarRepairOrder extends Order{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1416449722884362998L;
	
	private Double travelMiles;
	private Map<String, Double> repairItem = new HashMap<String, Double>();
	private String note;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Double getTravelMiles() {
		return travelMiles;
	}
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="order_map_repair_item")
	@MapKeyColumn(name = "item_name")
	public Map<String, Double> getRepairItem() {
		return repairItem;
	}
	public String getNote() {
		return note;
	}
	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
	}
	public void setRepairItem(Map<String, Double> repairItem) {
		this.repairItem = repairItem;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
