package beat.mercy.entity;

import javax.persistence.Entity;

@Entity
public class CarBeautifyOrder extends Order {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8427259211153600203L;

	private String shampooOption;		// 清洗选项
	private String waxOption;			// 上蜡选项
	private String internalwashOption;	// 内饰清洗选项
	private String note;		// 备注
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getShampooOption() {
		return shampooOption;
	}
	public String getWaxOption() {
		return waxOption;
	}
	public String getInternalwashOption() {
		return internalwashOption;
	}
	public String getNote() {
		return note;
	}
	public void setShampooOption(String shampooOption) {
		this.shampooOption = shampooOption;
	}
	public void setWaxOption(String waxOption) {
		this.waxOption = waxOption;
	}
	public void setInternalwashOption(String internalwashOption) {
		this.internalwashOption = internalwashOption;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
