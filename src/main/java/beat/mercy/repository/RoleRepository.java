package beat.mercy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.rbac.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	@Query("select role from Role role where role.id=1")
	public Role getCustomerRole();
	
	@Query("select role from Role role where role.id=2")
	public Role getStaffRole();
	
	public List<Role> findByUsersId(Long userId);
	
	public Role findByName(String name); 
}
