package beat.mercy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import beat.mercy.entity.base.BaseCarService;

@Repository
public interface CarServiceRepository extends JpaRepository<BaseCarService,Long> {
	public List<BaseCarService> findByName(String name);
}
