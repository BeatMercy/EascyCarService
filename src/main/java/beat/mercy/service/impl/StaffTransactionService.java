package beat.mercy.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import beat.mercy.common.exception.OrderTransactionException;
import beat.mercy.common.util.RandomStringGenerator;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Order;
import beat.mercy.entity.dto.OrderDTO;
import beat.mercy.entity.dto.SelectOptionDTO;
import beat.mercy.entity.option.SelectOption;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.OrderRepository;
import beat.mercy.repository.SelectOptionRepository;
import beat.mercy.service.IStaffTransactionService;

@Service
public class StaffTransactionService implements IStaffTransactionService {

	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private SelectOptionRepository optionRepo;

	@Transactional(rollbackFor = { OrderTransactionException.class })
	@Override
	public Boolean submitOrder(Long staffId, OrderDTO orderDto, SelectOptionDTO[] optionDtos)
			throws OrderTransactionException {
		if (orderDto.getBasePrice() == null)
			orderDto.setBasePrice(0D);
		Order order = new Order();
		BeanUtils.copyProperties(orderDto, order);

		String serviceName = "";
		if (orderDto.getSelectedService().equals("carBeautify")) {
			serviceName = "洗车美容";
			order.setOrderNo("cb" + RandomStringGenerator.getOrderNo());
		} else if (orderDto.getSelectedService().equals("carMaintenance")) {
			serviceName = "保养维护";
			order.setOrderNo("cm" + RandomStringGenerator.getOrderNo());
		} else
			throw new OrderTransactionException("未知订单服务类型");
		// 生成订单基本数据
		order.setType(orderDto.getSelectedService());
		order.setName(orderDto.getPlateNo() + serviceName + "订单");

		order.setState(OrderState.UNPAY);
		order.setProgress(ServiceProgress.PENDING);
		Customer customer = customerRepo.findByVehiclesPlateNo(order.getPlateNo());

		order.setStaffId(staffId);
		if (customer != null)
			order.setUserId(customer.getId());
		else
			order.setUserId(null);

		// 处理订单选项
		Double total = 0 + orderDto.getBasePrice();
		Map<String, Double> selectedOptions = new HashMap<String, Double>();
		for (SelectOptionDTO dto : optionDtos) {
			if (dto == null)
				continue;
			selectedOptions.put(dto.getItemName(), dto.getPrice());
			total = +dto.getPrice();
		}
		order.setSelectedOption(selectedOptions);

		order.setTotal(total);
		try {
			orderRepo.save(order);
		} catch (Exception e) {
			throw new OrderTransactionException(e.getMessage());
		}
		return true;
	}

	@Override
	public Boolean submitCarRepairOrder(OrderDTO orderDto, SelectOptionDTO[] optionDtos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = { OrderTransactionException.class })
	public Boolean startWorkingOrder(Long staffId, String orderNo) throws OrderTransactionException {
		Order order = orderRepo.findByOrderNo(orderNo);
		if(!order.getStaffId().equals(staffId))
			throw new OrderTransactionException("操作与原员工不一致");
		if(order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可开始操作");
		order.setProgress(ServiceProgress.WORKING);
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean cancelOrder(Long staffId, String orderNo) throws OrderTransactionException{
		Order order = orderRepo.findByOrderNo(orderNo);
		if(!order.getStaffId().equals(staffId))
			throw new OrderTransactionException("操作与原员工不一致");
		if(order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可操作");
		order.setState(OrderState.CANCELED);
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean finishOrderService(String orderNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean finishOrder(String orderNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
