package beat.mercy.entity;

import javax.persistence.Entity;

import beat.mercy.entity.base.BaseCarService;

@Entity
public class CarMaintenanceCombo extends BaseCarService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2875401989405999494L;

	private String healOption;
	private String engineFilterOption;
	private String engineOilOption;
	private String breakOilOption;
	private String antifreezeFluidOption;
	private String transmissionOilOption;
	
	// big heal
	private String airFilterOption;
	private String fuseFilterOption;
	private String note;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getHealOption() {
		return healOption;
	}
	public String getEngineFilterOption() {
		return engineFilterOption;
	}
	public String getEngineOilOption() {
		return engineOilOption;
	}
	public String getBreakOilOption() {
		return breakOilOption;
	}
	public String getAntifreezeFluidOption() {
		return antifreezeFluidOption;
	}
	public String getTransmissionOilOption() {
		return transmissionOilOption;
	}
	public String getAirFilterOption() {
		return airFilterOption;
	}
	public String getFuseFilterOption() {
		return fuseFilterOption;
	}
	public String getNote() {
		return note;
	}
	//---------------------------------
	
	public void setHealOption(String healOption) {
		this.healOption = healOption;
	}
	public void setEngineFilterOption(String engineFilterOption) {
		this.engineFilterOption = engineFilterOption;
	}
	public void setEngineOilOption(String engineOilOption) {
		this.engineOilOption = engineOilOption;
	}
	public void setBreakOilOption(String breakOilOption) {
		this.breakOilOption = breakOilOption;
	}
	public void setAntifreezeFluidOption(String antifreezeFluidOption) {
		this.antifreezeFluidOption = antifreezeFluidOption;
	}
	public void setTransmissionOilOption(String transmissionOilOption) {
		this.transmissionOilOption = transmissionOilOption;
	}
	public void setAirFilterOption(String airFilterOption) {
		this.airFilterOption = airFilterOption;
	}
	public void setFuseFilterOption(String fuseFilterOption) {
		this.fuseFilterOption = fuseFilterOption;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
