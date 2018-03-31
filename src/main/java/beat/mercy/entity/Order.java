package beat.mercy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import beat.mercy.common.util.RandomStringGenerator;
import beat.mercy.entity.base.BaseEntity;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.PayMethod;
import beat.mercy.entity.state.ServiceProgress;

@Entity
@Table(name = "order")
public class Order extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4770937925087259672L;
	
	private String type;
	private String orderNo;
	private String thirdPartyOrderNo;
	private String plateNo;
	private Date endTime;	// 订单结束时间/取消时间
	private Double total;
	private PayMethod paymethod;
	private OrderState state;
	private Long userId;	
	@PrePersist
	private void generateOrderNo() {
		this.orderNo=RandomStringGenerator.getOrderNo();
	}
	
	@Column(updatable=false,insertable=false,name="dtype")
	public String getType() {
		return type;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public Date getEndTime() {
		return endTime;
	}
	public Double getTotal() {
		return total;
	}
	public PayMethod getPaymethod() {
		return paymethod;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getThirdPartyOrderNo() {
		return thirdPartyOrderNo;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public OrderState getState() {
		return state;
	}

	public Long getUserId() {
		return userId;
	}
	
	//---------------------setter
	


	public void setType(String type) {
		this.type = type;
	}
	public void setThirdPartyOrderNo(String thirdPartyOrderNo) {
		this.thirdPartyOrderNo = thirdPartyOrderNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public void setPaymethod(PayMethod paymethod) {
		this.paymethod = paymethod;
	}
	
	
}
