package beat.mercy.service;


import org.springframework.data.domain.Page;

import beat.mercy.common.exception.AccountTransactionException;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.entity.Order;
import beat.mercy.entity.Vehicle;
import beat.mercy.entity.state.LatestDateRange;

public interface ICustomerTransactionService {

	public Page<Order> findCustomerOrders(Long customerId,LatestDateRange dateRange,PageableBuilder pageableBuilder);
	
	public Page<? extends Order> findCustomerMaintenance(Long customerId,LatestDateRange dateRange,PageableBuilder pageableBuilder);
	public Page<? extends Order> findCustomerRepair(Long customerId,LatestDateRange dateRange,PageableBuilder pageableBuilder);
	
	/**
	 * 绑定用户车辆信息并保存新的汽车信息
	 * author: Mercy Wu(a3049)
	 * 2018年5月8日 下午1:16:40
	 * @param userId
	 * @param vehicle
	 * @return
	 */
	public RestJsonResult bindCar(Long userId,Vehicle vehicle);
	
	/**
	 * 用户修改车辆信息
	 * author: Mercy Wu(a3049)
	 * 2018年5月8日 下午1:31:12
	 * @param userId
	 * @param vehicle
	 * @return
	 */
	public RestJsonResult editCar(Long userId,Vehicle vehicle);
	
	public RestJsonResult unbindCar(Long userId,Long vehicleId);
}
