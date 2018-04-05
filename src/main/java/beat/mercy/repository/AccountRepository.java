package beat.mercy.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.base.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	@Cacheable(cacheNames="userTokenInfo", key="#p0")
	@Query("select a from Account a where username = :username")
	Account findByUsernameCache(@Param("username")String username);
	
	Account findByUsername(String username); 
}
