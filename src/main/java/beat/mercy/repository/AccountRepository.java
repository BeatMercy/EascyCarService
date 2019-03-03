package beat.mercy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.base.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

//	@Cacheable(cacheNames="userTokenInfo", key="#p0")
	@Query("select DISTINCT a from Account a Left Join Fetch a.roles, Authority where username = :username")
	Account findByUsernameCache(@Param("username")String username);
	
	@Query("select DISTINCT a from Account a Left Join Fetch a.roles, Authority where username = :username or phone= :username")
	Account findByUsernameJoinRoleAuthority(@Param("username")String username);
	
	Account findByUsername(String username);
	
	Page<Account> findByPhoneOrRealNameOrWeixin(String phone,String realName,String weixin,Pageable pageable);
	
}
