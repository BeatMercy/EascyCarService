package beat.mercy.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Order;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>,JpaSpecificationExecutor<Order>{
	public Order findByOrderNo(String orderNo);
	
	public Page<Order> findByStaffId(Long staffId,Pageable pageable);
	
	public Page<Order> findByStaffIdAndProgress(Long staffId,ServiceProgress progress,Pageable pageable);
	
	public Page<Order> findByStaffIdAndProgressAndStateNotIn(Long staffId,ServiceProgress progress,OrderState[] state,Pageable pageable);

	public Page<Order> findByStaffIdAndProgressAndStateNot(Long staffId,ServiceProgress progress,OrderState state,Pageable pageable);

	public Page<Order> findByStaffIdAndState(Long staffId,OrderState state,Pageable pageable);
	
	public Page<Order> findByState(OrderState state,Pageable pageable);
	
	public List<Order> findByState(OrderState state);
	
	public List<Order> findByStateAndPlateNoLike(OrderState state,String plateNo);

}

