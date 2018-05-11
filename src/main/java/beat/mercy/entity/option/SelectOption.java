package beat.mercy.entity.option;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;

import beat.mercy.entity.base.BaseEntity;

@Entity
public class SelectOption extends BaseEntity {

	public final static String CAR_BEAUTIFY_SERVICE = "carBeautify";
	public final static String CAR_MAINTENANCE_SERVICE = "carMaintenance";
	public final static String CAR_REPAIR_SERVICE = "carRepair";

	public final static String WAX_OPTION = "waxOption";
	public final static String SHAMPOO_OPTION = "shampooOption";
	public final static String INTERNAL_WASH_OPTION = "internalwashOption";
	public final static String HEAL_OPTION = "healOption";
	public final static String ENGINE_FILTER_OPTION = "engineFilterOption";
	public final static String ENGINE_OIL_OPTION = "engineOilOption";
	public final static String BREAK_OIL_OPTION = "breakOilOption";
	public final static String ANTI_FREEZE_FLUID_OPTION = "antifreezeFluidOption";
	public final static String TRANSMISSION_OIL_OPTION = "transmissionOilOption";

	/**
	 * 
	 **/
	private static final long serialVersionUID = 1L;

	private String name;
	private String serviceType;
	private String dtype;
	private Boolean enable;
	private String optionType;
	private String itemName;
	private Double price;

	@PrePersist
	private void beforeSave() {
		this.enable = true;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(updatable = false, insertable = false, name = "dtype")
	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getServiceType() {
		return serviceType;
	}

	public String getOptionType() {
		return optionType;
	}

	public String getItemName() {
		return itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}
