package beat.mercy.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrePersist;

import beat.mercy.entity.base.BaseEntity;
import beat.mercy.entity.state.AdvertiseLocation;

@Entity
public class Advertisement extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7026417202110193235L;
	
	private String title;
	private String description;
	private Integer sequence;
	private String imgUrl;
	private String targetUrl;
	private Boolean isShow;
	private Boolean isOutsideHref;
	private AdvertiseLocation location;
	
	@PrePersist
	private void preset() {
		if(this.isShow==null)
			this.isShow=false;
		if(isOutsideHref==null)
			this.isOutsideHref=false;
		if(this.sequence==null)
			this.sequence=0;
		if(this.location==null)
			this.location=AdvertiseLocation.HOME;
	}
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public Integer getSequence() {
		return sequence;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public Boolean getIsOutsideHref() {
		return isOutsideHref;
	}
	public String getTargetUrl() {
		return targetUrl;
	}

	@Enumerated(EnumType.ORDINAL)
	public AdvertiseLocation getLocation() {
		return location;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//——————————————————————————
	
	
	public void setLocation(AdvertiseLocation location) {
		this.location = location;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}
	public Boolean getIsShow() {
		return isShow;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public void setIsOutsideHref(Boolean isOutsideHref) {
		this.isOutsideHref = isOutsideHref;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	
	
}
