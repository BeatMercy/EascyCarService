package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.CarMaintenanceOrder;

@Repository
public interface CarMaintenanceOrderRepository extends JpaRepository<CarMaintenanceOrder, Long> {

}
