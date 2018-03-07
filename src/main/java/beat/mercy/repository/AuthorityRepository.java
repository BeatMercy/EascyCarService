package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.rbac.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	public Authority findByName(String name);
}
