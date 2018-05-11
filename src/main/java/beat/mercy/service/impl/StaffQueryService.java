package beat.mercy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Order;
import beat.mercy.entity.Vehicle;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;
import beat.mercy.repository.OrderRepository;
import beat.mercy.service.IStaffQueryService;

@Service
public class StaffQueryService implements IStaffQueryService {

	@Autowired
	OrderRepository orderRepo;

	@Override
	public Page<Vehicle> findPresentVehicle(PageableBuilder pageableBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Order> findOrderUnpageForCashier(String plateNo) {
		if (plateNo.trim().equals("")) {
			return orderRepo.findByState(OrderState.UNPAY);
		} else {
			return orderRepo.findByStateAndPlateNoLike(OrderState.UNPAY,plateNo);
		}
	}

	@Override
	public Page<Order> findMyWorkOrder(Long staffId, ServiceProgress progress, PageableBuilder pageableBuilder) {
		if (pageableBuilder.getPageNum() == null || pageableBuilder.getPageNum() < 1) {
			pageableBuilder.setPageNum(1);
		}
		if (pageableBuilder.getPageSize() == null || pageableBuilder.getPageSize() < 1) {
			pageableBuilder.setPageSize(10);
		}
//		if (progress.equals(ServiceProgress.WAITING_CONFIRM)) {
//			OrderState[] states = { OrderState.CANCELED, OrderState.FINISHED };
//			return orderRepo.findByStaffIdAndProgressAndStateNotIn(staffId, progress, states,
//					pageableBuilder.getPageable());
//		}
		return orderRepo.findByStaffIdAndProgressAndStateNot(staffId, progress, OrderState.CANCELED,
				pageableBuilder.getPageable());
	}

	@Override
	public Page<Order> findAllOrders(OrderState state, PageableBuilder pageableBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

}
