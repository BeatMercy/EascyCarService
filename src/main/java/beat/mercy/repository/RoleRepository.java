package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.rbac.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	@Query("select role from Role role where role.name='ROLE_USER'")
	public Role getCustomerRole();
	
	public Role findByName(String name); 
}
