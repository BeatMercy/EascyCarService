package beat.mercy.entity;

import beat.mercy.entity.base.BaseEntity;

public class SaleItem extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6388701283834361724L;
	
	private String name;
	private Double price;
	private Integer storage;
	private Integer saleAmount;
	private String tumbnailImg;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public Integer getStorage() {
		return storage;
	}
	public Integer getSaleAmount() {
		return saleAmount;
	}
	public String getTumbnailImg() {
		return tumbnailImg;
	}
	
	// -------------------------------------
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setStorage(Integer storage) {
		this.storage = storage;
	}
	public void setSaleAmount(Integer saleAmount) {
		this.saleAmount = saleAmount;
	}
	public void setTumbnailImg(String tumbnailImg) {
		this.tumbnailImg = tumbnailImg;
	} 
	
	
}
