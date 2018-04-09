package beat.mercy.entity;

import java.util.Date;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.MapKeyColumn;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import beat.mercy.common.util.RandomStringGenerator;
import beat.mercy.entity.base.BaseEntity;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.PayMethod;
import beat.mercy.entity.state.ServiceProgress;

@Entity
//@EntityListeners(OrderListener.class)
@Table(name = "service_order")
public class Order extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4770937925087259672L;

	private String type;
	private String name;
	private String orderNo;
	private String thirdPartyOrderNo;

	private String plateNo;
	private Double travelMiles;

	private Date endTime; // 订单结束时间/取消时间
	private OrderState state;
	private Long staffId;
	private Long userId;
	private Double total; // 预计总价

	private Double basePrice;
	private Map<String, Double> selectedOption;

	private Boolean isResetTotal;
	private Double resetTotal; // 重设总价
	private PayMethod payMethod;
	private ServiceProgress progress;
	private String note;

	@PrePersist
	private void generateOrderNo() {
		
		if (this.orderNo == null) {
			this.orderNo = "un" + RandomStringGenerator.getOrderNo();
		}
	}

	@Column(updatable = false, name = "dtype")
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

	public Double getTravelMiles() {
		return travelMiles;
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

	public Long getStaffId() {
		return staffId;
	}

	public ServiceProgress getProgress() {
		return progress;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public String getName() {
		return name;
	}

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "order_map_option_price")
	@MapKeyColumn(name = "option_name")
	public Map<String, Double> getSelectedOption() {
		return selectedOption;
	}

	public Boolean getIsResetTotal() {
		return isResetTotal;
	}

	public Double getResetTotal() {
		return resetTotal;
	}

	public PayMethod getPayMethod() {
		return payMethod;
	}

	public String getNote() {
		return note;
	}

	// ---------------------setter

	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSelectedOption(Map<String, Double> selectedOption) {
		this.selectedOption = selectedOption;
	}

	public void setIsResetTotal(Boolean isResetTotal) {
		this.isResetTotal = isResetTotal;
	}

	public void setResetTotal(Double resetTotal) {
		this.resetTotal = resetTotal;
	}

	public void setPayMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}

	public void setProgress(ServiceProgress progress) {
		this.progress = progress;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

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

}
