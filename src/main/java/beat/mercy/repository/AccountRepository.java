package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.base.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUsername(String username); 
}
