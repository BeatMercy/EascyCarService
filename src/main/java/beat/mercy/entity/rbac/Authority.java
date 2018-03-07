package beat.mercy.entity.rbac;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import beat.mercy.entity.base.BaseEntity;

@Entity
public class Authority extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7387339093887516924L;
	private String name;
	private Set<Role> roles;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.REFRESH,mappedBy="roles")
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Authority) {
			Authority o = (Authority)obj;
			return this.getId()==o.getId()?true:false;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}
}
