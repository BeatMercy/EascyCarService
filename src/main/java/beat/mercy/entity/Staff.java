package beat.mercy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import beat.mercy.entity.base.BaseEntity;
import beat.mercy.entity.rbac.Role;

@Entity
@Table(name="staff")
public class Staff extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5234105713816444039L;
	private String type;
	private String name;
	private String staffNumber;
	private String phoneNum;
	private Staff superior;//上司
	private List<Staff> subordinates;//下属
	private String password;
	private Role role;
	
	@Column(updatable=false,insertable=false,name="dtype")
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getStaffNumber() {
		return staffNumber;
	}
	public String getPassword() {
		return password;
	}
	//---------------自身一对多 多对一 ------------
	@ManyToOne(cascade=CascadeType.ALL)
	public Staff getSuperior() {
		return superior;
	}
	
	@OneToMany(mappedBy="superior",cascade=CascadeType.ALL)
	public List<Staff> getSubordinates() {
		return subordinates;
	}
	//---------------------------------------------------
	
	@JsonIgnore
	@ManyToOne
	public Role getRole() {
		return role;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	//--------------------------
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSuperior(Staff superior) {
		this.superior = superior;
	}
	public void setSubordinates(List<Staff> subordinates) {
		this.subordinates = subordinates;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
