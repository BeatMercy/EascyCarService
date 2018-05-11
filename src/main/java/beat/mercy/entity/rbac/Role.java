package beat.mercy.entity.rbac;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import beat.mercy.entity.base.Account;
import beat.mercy.entity.base.BaseEntity;

@Entity
public class Role extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5216244007248660438L;

	private String name;
	private Set<Authority> authorities = new HashSet<>();
	private Set<Account> users = new HashSet<>();

	public Role() {
		super();
	}

	public Role(final String name) {
		super();
		this.name = name;
	}

	public Role(final String name, Set<Authority> authorities) {
		super();
		this.name = name;
		this.authorities = authorities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Role role = (Role) obj;
		if (!role.equals(role.name)) {
			return false;
		}
		return true;
	}

	public String getName() {
		return name;
	}
	@JsonIgnore
	@ManyToMany(mappedBy = "roles")
	public Set<Account> getUsers() {
		return users;
	}
	@JsonIgnore
	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
    		name = "roles_authorities",
    		joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
    		inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUsers(Set<Account> users) {
		this.users = users;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Role [name=").append(name).append("]").append("[id=").append(id).append("]");
		return builder.toString();
	}
}
