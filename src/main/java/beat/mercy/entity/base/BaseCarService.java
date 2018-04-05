package beat.mercy.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "car_service")
public class BaseCarService extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String type;	// 服务类型
	protected String tags;
	protected String name;
	protected String description;
	protected String thumbnailImg;
	protected String[] imges;
	protected Boolean isSelling;
	protected Integer saleCount;
	protected Double price;
	
	@PrePersist
	protected void prePersist() {
		this.isSelling=false;
		this.saleCount=0;
	}
	
	@Column(updatable=false,insertable=false,name="dtype")
	public String getType() {
		return type;
	}
	
	@NotEmpty
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	public String getThumbnailImg() {
		return thumbnailImg;
	}
	public String[] getImges() {
		return imges;
	}
	public Boolean getIsSelling() {
		return isSelling;
	}
	public Integer getSaleCount() {
		return saleCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTags() {
		return tags;
	}
	@Column(nullable=false)
	public Double getPrice() {
		return price;
	}
	
	// ------------------
	
	public void setPrice(Double price) {
		this.price = price;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setThumbnailImg(String thumbnailImg) {
		this.thumbnailImg = thumbnailImg;
	}
	public void setImges(String[] imges) {
		this.imges = imges;
	}
	public void setIsSelling(Boolean isSelling) {
		this.isSelling = isSelling;
	}
	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}
	
	
	
}
