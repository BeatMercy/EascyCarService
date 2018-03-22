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
	
	public Authority() {
		super();
	} 
	public Authority(final String name) {
        super();
        this.name = name;
    }
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Authority other = (Authority) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Privilege [name=").append(name).append("]").append("[id=").append(id).append("]");
        return builder.toString();
    }
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}
	
	@ManyToMany(mappedBy = "authorities")
	public Set<Role> getRoles() {
		return roles;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
    
    
}
