package beat.mercy.entity.dto;

import java.util.Date;
import java.util.Map;

import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.PayMethod;
import beat.mercy.entity.state.ServiceProgress;

public class OrderDTO {
	private Long id;
	private String selectedService;
	private String orderNo;
	private String thirdPartyOrderNo;
	private String plateNo;
	private String chassisNo;
	private String engineNo;
	private Date endTime;	// 订单结束时间/取消时间
	private OrderState state;
	private Long staffId;
	private Long userId;	
	
	private Double basePrice;
	private Map<String, Double> selectedOption;
	private Double total;	// 预计总价
	
	
	private PayMethod payMethod;
	private ServiceProgress progress;
	private Double travelMiles;
	private String note;

	public Long getId() {
		return id;
	}
	public String getSelectedService() {
		return selectedService;
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
	public Double getBasePrice() {
		return basePrice;
	}
	public Map<String, Double> getSelectedOption() {
		return selectedOption;
	}
	public Double getTotal() {
		return total;
	}
	public PayMethod getPayMethod() {
		return payMethod;
	}
	public ServiceProgress getProgress() {
		return progress;
	}
	public Double getTravelMiles() {
		return travelMiles;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSelectedService(String selectedService) {
		this.selectedService = selectedService;
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
	public String getChassisNo() {
		return chassisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
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
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	public void setSelectedOption(Map<String, Double> selectedOption) {
		this.selectedOption = selectedOption;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public void setPayMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}
	public void setProgress(ServiceProgress progress) {
		this.progress = progress;
	}
	public void setTravelMiles(Double travelMiles) {
		this.travelMiles = travelMiles;
	}
	
	//-------
	
	
}
