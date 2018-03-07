package beat.mercy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import beat.mercy.entity.base.BaseEntity;

@Entity
@Table(name= "comment")
public class Comment extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3907112155540722576L;
	private Customer customer;
	private String content;
	
	@OneToOne(cascade=CascadeType.REFRESH)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
