package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.CarRepairOrder;

@Repository
public interface CarRepairOrderRepository extends JpaRepository<CarRepairOrder, Long> {

}
