package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>,JpaSpecificationExecutor<Order>{
	public Order findByOrderNo(String orderNo);
}
