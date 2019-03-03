package beat.mercy.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Order;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>,JpaSpecificationExecutor<Order>{
	public Order findByOrderNo(String orderNo);
	
	public Page<Order> findByStaffId(Long staffId,Pageable pageable);
	
	public Page<Order> findByType(String type,Pageable pageable);
	
	@Query("select sOrder from beat.mercy.entity.Order sOrder where sOrder.type=:type and (sOrder.orderNo like :keyword or sOrder.plateNo like :keyword)")
	public Page<Order> findByTypeAndKeyword(@Param("type") String type,
			@Param("keyword") String keyword, Pageable pageable);
	
	public Page<Order> findByStaffIdAndProgress(Long staffId,ServiceProgress progress,Pageable pageable);
	
	public Page<Order> findByStaffIdAndProgressAndStateNotIn(Long staffId,ServiceProgress progress,OrderState[] state,Pageable pageable);

	public Page<Order> findByStaffIdAndProgressAndStateNot(Long staffId,ServiceProgress progress,OrderState state,Pageable pageable);

	public Page<Order> findByStaffIdAndState(Long staffId,OrderState state,Pageable pageable);
	
	public Page<Order> findByState(OrderState state,Pageable pageable);
	
	public List<Order> findByState(OrderState state);
	
	public List<Order> findByState(OrderState state,Sort sort);
	
	public List<Order> findByStateAndPlateNoLike(OrderState state,String plateNo);

	public List<Order> findByStateAndPlateNoLike(OrderState state,String plateNo,Sort sort);

	public Page<Order> findByUserId(Long userId,Pageable pageable);
	
	public Page<Order> findByUserIdAndType(Long userId,String type,Pageable pageable);
	
	public Page<Order> findByUserIdAndCreateTimeAfter(Long userId,Date afterDate,Pageable pageable);
	
	public Page<Order> findByUserIdAndTypeAndCreateTimeAfter(Long userId,String type,Date afterDate,Pageable pageable);
	
	public Page<Order> findByStaffIdAndCreateTimeAfter(Long staffId,Date afterDate,Pageable pageable);

	
}

