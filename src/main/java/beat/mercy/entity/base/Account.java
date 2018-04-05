package beat.mercy.entity.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;

import beat.mercy.entity.rbac.Role;

@Entity
public class Account extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6607363271414843097L;
	
	private String username;
    private String password;
	private String type;
	private String realName;
    private String phone;
    private boolean enabled;
    private String weixin;
    private String qq;
    private String headimg;
    private Set<Role> roles = new HashSet<>();

    @PrePersist
    private void beforePersist() {
    	this.enabled=true;
    }
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Column(nullable=false,unique=true)
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getType() {
		return type;
	}

	public String getRealName() {
		return realName;
	}

	public String getPhone() {
		return phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public String getWeixin() {
		return weixin;
	}

	public String getQq() {
		return qq;
	}

	public String getHeadimg() {
		return headimg;
	}

	@JsonIgnore
	 @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(
	    		name = "account_roles",
	    		joinColumns = @JoinColumn(name = "account_id", referencedColumnName = "id"), 
	    		inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	public Set<Role> getRoles() {
		return roles;
	}
	
	//————————————————————setter

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

    
    //————————————————————————————————
	
	
}
