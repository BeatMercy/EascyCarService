package beat.mercy.entity.dto;

public class SelectOptionDTO {

	private String name;
	private String serviceType;
	private String dtype;
	private String optionType;
	private String itemName;
	private Double price;
	
	
	public String getName() {
		return name;
	}
	public String getServiceType() {
		return serviceType;
	}
	public String getDtype() {
		return dtype;
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
	public void setName(String name) {
		this.name = name;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public void setDtype(String dtype) {
		this.dtype = dtype;
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
	
	
	
}
