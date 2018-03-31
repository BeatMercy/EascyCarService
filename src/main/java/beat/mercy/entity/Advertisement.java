package beat.mercy.entity;

import javax.persistence.Entity;

import beat.mercy.entity.base.BaseEntity;

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
	
	//——————————————————————————
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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
