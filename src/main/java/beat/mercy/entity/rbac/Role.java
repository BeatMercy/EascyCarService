package beat.mercy.entity.rbac;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import beat.mercy.entity.base.BaseEntity;

@Entity
public class Role extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5216244007248660438L;
	private String name;
	private Set<Authority> authorites;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany(cascade=CascadeType.ALL)
	public Set<Authority> getAuthorites() {
		return authorites;
	}
	public void setAuthorites(Set<Authority> authorites) {
		this.authorites = authorites;
	}
	
	
}
