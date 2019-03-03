package beat.mercy.service.impl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import beat.mercy.common.exception.OrderTransactionException;
import beat.mercy.common.util.RandomStringGenerator;
import beat.mercy.entity.CarRepairOrder;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Order;
import beat.mercy.entity.base.Account;
import beat.mercy.entity.dto.OrderDTO;
import beat.mercy.entity.dto.SelectOptionDTO;
import beat.mercy.entity.option.SelectOption;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;
import beat.mercy.repository.AccountRepository;
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
	private AccountRepository accountRepo;
	
	@Autowired
	private SelectOptionRepository optionRepo;

	public Boolean onlyEnglishInside(String str) {
		if (str.length() > 6)
			return false;
		List<Character> characters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'0');
		String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for (int i = 0; i < str.length(); i++) {
			if (!characters.contains(str.charAt(i)))
				return false;
		}
		return true;
	}

	@Transactional(rollbackFor = { OrderTransactionException.class })
	@Override
	public Boolean submitOrder(Long staffId, OrderDTO orderDto, SelectOptionDTO[] optionDtos)
			throws OrderTransactionException {
		if (orderDto.getBasePrice() == null)
			orderDto.setBasePrice(0D);
		Order order = new Order();
		if (!onlyEnglishInside(orderDto.getPlateNo().substring(1)))
			throw new OrderTransactionException("车牌不合法");
		BeanUtils.copyProperties(orderDto, order);

		String serviceName = "";
		if (orderDto.getSelectedService().equals("CarBeautifyOrder")) {
			serviceName = "洗车美容";
			order.setOrderNo("cb" + RandomStringGenerator.getOrderNo());
		} else if (orderDto.getSelectedService().equals("CarMaintenanceOrder")) {
			serviceName = "保养维护";
			order.setOrderNo("cm" + RandomStringGenerator.getOrderNo());
		} else
			throw new OrderTransactionException("未知订单服务类型");
		// 生成订单基本数据
		order.setType(orderDto.getSelectedService());
		order.setName(orderDto.getPlateNo() + serviceName + "订单");

		order.setState(OrderState.UNPAY);
		order.setProgress(ServiceProgress.PENDING);
		order.setStaffId(staffId);
		Customer customer = customerRepo.findByVehiclesPlateNo(order.getPlateNo());
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
			SelectOption o = optionRepo.findByNameAndItemName(dto.getName(), dto.getItemName());
			selectedOptions.put(dto.getName()+": "+dto.getItemName(),o.getPrice());
			total = +o.getPrice();
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
	public Boolean submitCarRepairOrder(Long staffId,OrderDTO orderDto, SelectOptionDTO[] optionDtos) throws OrderTransactionException {
		if (orderDto.getBasePrice() == null)
			orderDto.setBasePrice(0D);
		if (!onlyEnglishInside(orderDto.getPlateNo().substring(1)))
			throw new OrderTransactionException("车牌不合法");
		CarRepairOrder repairOrder = new CarRepairOrder();
		BeanUtils.copyProperties( orderDto,repairOrder);
		repairOrder.setOrderNo("rp" + RandomStringGenerator.getOrderNo());
		repairOrder.setName(orderDto.getPlateNo()+"维修订单");
		repairOrder.setState(OrderState.UNPAY);
		repairOrder.setProgress(ServiceProgress.PENDING);
		repairOrder.setStaffId(staffId);
		
		Customer customer = customerRepo.findByVehiclesPlateNo(repairOrder.getPlateNo());
		if (customer != null)
			repairOrder.setUserId(customer.getId());
		else
			repairOrder.setUserId(null);
		// 处理维修选项
		Double total = 0 + orderDto.getBasePrice();
		Map<String, Double> selectedOptions = new HashMap<String, Double>();
		for (SelectOptionDTO dto : optionDtos) {
			if (dto == null)
				continue;
			selectedOptions.put(dto.getItemName(), dto.getPrice());
			total = +dto.getPrice();
		}
		repairOrder.setSelectedOption(selectedOptions);

		repairOrder.setTotal(total);
		try {
			orderRepo.save(repairOrder);
		} catch (Exception e) {
			throw new OrderTransactionException(e.getMessage());
		}
		return true;
	}

	@Override
	@Transactional(rollbackFor = { OrderTransactionException.class })
	public Boolean startWorkingOrder(Long staffId, String orderNo) throws OrderTransactionException {
		Order order = orderRepo.findByOrderNo(orderNo);
		if (order == null)
			throw new OrderTransactionException("查无此单");
		if (!order.getStaffId().equals(staffId))
			throw new OrderTransactionException("操作与原员工不一致");
		if (order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可开始操作");
		order.setProgress(ServiceProgress.WORKING);
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean cancelOrder(Long staffId, String orderNo) throws OrderTransactionException {
		Order order = orderRepo.findByOrderNo(orderNo);
		if (order == null)
			throw new OrderTransactionException("查无此单");
		if (!order.getStaffId().equals(staffId))
			throw new OrderTransactionException("操作与原员工不一致");
		if (order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可操作");
		order.setState(OrderState.CANCELED);
		order.setEndTime(new Date());
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean finishOrderService(Long staffId, String orderNo) throws OrderTransactionException {
		Order order = orderRepo.findByOrderNo(orderNo);
		if (order == null)
			throw new OrderTransactionException("查无此单");
		if (!order.getStaffId().equals(staffId))
			throw new OrderTransactionException("操作与原员工不一致");
		if (order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可操作");

//		if (order.getType().equals("CarRepairOrder"))
//			order.setProgress(ServiceProgress.WAITING_CONFIRM);
//		else
		
		
		order.setProgress(ServiceProgress.FINISHED);
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean finishOrder(String orderNo) throws OrderTransactionException {
		Order order = orderRepo.findByOrderNo(orderNo);
		if (order == null)
			throw new OrderTransactionException("查无此单");
		if (order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可操作");
		if(order.getType().equals("CarRepairOrder")) {
			// 生成维修记录
			
		}else if(order.getType().equals("CarMaintenanceOrder")) {
			// 生成保养记录
			
		}
		double total = 0d;
		if(order.getIsResetTotal()){
			total=order.getResetTotal();
		}else {
			total=order.getTotal();
		}
		Customer account = customerRepo.findOne(order.getUserId());
		BigDecimal b = new BigDecimal(total);
		int after = account.getConsumePoint()+b.setScale(0,BigDecimal.ROUND_UP).intValue();
		account.setConsumePoint(after);
		customerRepo.save(account);
		
		order.setEndTime(new Date());
		order.setState(OrderState.FINISHED);
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean cancelOrderByCashier(String orderNo) throws OrderTransactionException {
		Order order = orderRepo.findByOrderNo(orderNo);
		if (order == null)
			throw new OrderTransactionException("查无此单");
		if (order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可操作");
		if (order.getProgress().equals(ServiceProgress.WORKING))
			throw new OrderTransactionException("该订单业务正在进行中,取消请联系对应技工");
		order.setState(OrderState.CANCELED);
		orderRepo.save(order);
		return true;
	}

	@Override
	public Boolean resetOrderTotalByCashier(String orderNo, Double resetTotal, String note)
			throws OrderTransactionException {
		if (resetTotal == null || note == null || resetTotal < 0) {
			throw new OrderTransactionException("修改金额的信息不完整");
		}
		Order order = orderRepo.findByOrderNo(orderNo);
		if (order == null)
			throw new OrderTransactionException("查无此单");
		if (order.getState().equals(OrderState.CANCELED))
			throw new OrderTransactionException("该订单已取消,不可操作");
		order.setIsResetTotal(true);
		order.setResetTotal(resetTotal);
		order.setResetNote(note);
		orderRepo.save(order);

		return true;
	}

}
