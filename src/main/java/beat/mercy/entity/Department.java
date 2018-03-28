package beat.mercy.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import beat.mercy.entity.base.BaseEntity;

@Entity
public class Department extends BaseEntity {

	private String name;
	private Department superior;
	private Set<Department> subordinates;
	private Staff leader;
	private Set<Staff> staffs;

	// ---------------自身一对多 多对一 ------------
	@ManyToOne(cascade = CascadeType.ALL)
	public Department getSuperior() {
		return superior;
	}

	@OneToMany(fetch=FetchType.LAZY,mappedBy = "superior", cascade = CascadeType.ALL)
	public Set<Department> getSubordinates() {
		return subordinates;
	}
	public String getName() {
		return name;
	}

	@ManyToOne(cascade=CascadeType.REFRESH)
	public Staff getLeader() {
		return leader;
	}

	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	public Set<Staff> getStaffs() {
		return staffs;
	}
	
	// ---------------------------------------------------

	public void setSuperior(Department superior) {
		this.superior = superior;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLeader(Staff leader) {
		this.leader = leader;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

	public void setSubordinates(Set<Department> subordinates) {
		this.subordinates = subordinates;
	}
}
