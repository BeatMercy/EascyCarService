package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.CarBeautifyOrder;

@Repository
public interface CarBeautifyOrderRepository extends JpaRepository<CarBeautifyOrder, Long> {

}
