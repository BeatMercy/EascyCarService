package beat.mercy.entity.dto;

import java.util.Date;

import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.PayMethod;
import beat.mercy.entity.state.ServiceProgress;

public class OrderDTO {
	private Long id;
	private String type;
	private String orderNo;
	private String thirdPartyOrderNo;
	private String plateNo;
	private Date endTime;	// 订单结束时间/取消时间
	private OrderState state;
	private Long staffId;
	private Long userId;	
	
	private Double total;	// 预计总价
	
	private Boolean hasBasePrice;
	private Double basePrice;
	
	private Double finalTotal; 	// 最终定价
	private String finalTotalInfo; // 定价信息详情
	private PayMethod paymethod;
	private ServiceProgress progress;
	private Double travelMiles;
	
	//-------
	
	public Double getBasePrice() {
		return basePrice;
	}
	public Boolean getHasBasePrice() {
		return hasBasePrice;
	}
	public void setHasBasePrice(Boolean hasBasePrice) {
		this.hasBasePrice = hasBasePrice;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	public Long getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public String getThirdPartyOrderNo() {
		return thirdPartyOrderNo;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public Date getEndTime() {
		return endTime;
	}
	public OrderState getState() {
		return state;
	}
	public Long getStaffId() {
		return staffId;
	}
	public Long getUserId() {
		return userId;
	}
	public Double getTotal() {
		return total;
	}
	public Double getFinalTotal() {
		return finalTotal;
	}
	public String getFinalTotalInfo() {
		return finalTotalInfo;
	}
	public PayMethod getPaymethod() {
		return paymethod;
	}
	public ServiceProgress getProgress() {
		return progress;
	}
	public Double getTravelMiles() {
		return travelMiles;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public void setThirdPartyOrderNo(String thirdPartyOrderNo) {
		this.thirdPartyOrderNo = thirdPartyOrderNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public void setState(OrderState state) {
		this.state = state;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public void setFinalTotal(Double finalTotal) {
		this.finalTotal = finalTotal;
	}
	public void setFinalTotalInfo(String finalTotalInfo) {
		this.finalTotalInfo = finalTotalInfo;
	}
	public void setPaymethod(PayMethod paymethod) {
		this.paymethod = paymethod;
	}
	public void setProgress(ServiceProgress progress) {
		this.progress = progress;
	}
	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
	}
	
	
	
}
