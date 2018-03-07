package beat.mercy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import beat.mercy.entity.base.BaseEntity;
import beat.mercy.entity.rbac.Role;

/**
 * 
 * @author Mercy Wu(a3049)
 * 2018年3月6日
 */
@Entity  
@Table(name = "customer")  
public class Customer extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8485303414462923589L;
	private String username;
    private String password;
    private String phoneNum;
    private Role role;
    
    
    @Column(unique=true)
    public String getUsername() {  
        return username;  
    }  
  
    
    public String getPhoneNum() {
		return phoneNum;
	}

    @JsonIgnore
    @ManyToOne
	public Role getRole() {
		return role;
	}

    public String getPassword() {  
        return password;  
    }  
    
    //-----------------------------
    
    
    public void setUsername(String username) {  
        this.username = username;  
    }  
    
    
    public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public void setPassword(String password) {  
        this.password = password;  
    } 
}
