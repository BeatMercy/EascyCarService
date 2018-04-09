package beat.mercy.service;

import org.springframework.data.domain.Page;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Order;
import beat.mercy.entity.Vehicle;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;

public interface IStaffQueryService {

	public Page<Vehicle> findPresentVehicle(PageableBuilder pageableBuilder);
	
	public Page<Order> findMyWorkOrder(Long staffId,ServiceProgress progress,PageableBuilder pageableBuilder);
	
	public Page<Order> findAllOrders(OrderState state,PageableBuilder pageableBuilder);
	
}
