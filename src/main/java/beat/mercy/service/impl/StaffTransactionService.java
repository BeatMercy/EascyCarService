package beat.mercy.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import beat.mercy.entity.CarBeautifyOrder;
import beat.mercy.entity.dto.OrderDTO;
import beat.mercy.entity.dto.SelectOptionDTO;
import beat.mercy.entity.option.SelectOption;
import beat.mercy.repository.CarBeautifyOrderRepository;
import beat.mercy.repository.SelectOptionRepository;
import beat.mercy.service.IStaffTransactionService;

@Service
public class StaffTransactionService implements IStaffTransactionService {

	@Autowired
	private CarBeautifyOrderRepository carBeautifyOrderRepo;

	@Autowired
	private SelectOptionRepository optionRepo;

	@Transactional
	@Override
	public Boolean submitCarBeautifyOrder(OrderDTO orderDto, SelectOptionDTO optionDto) {
		Assert.notNull(orderDto, "");
		Assert.notNull(orderDto.getHasBasePrice(), "");
		CarBeautifyOrder order = new CarBeautifyOrder();
		if (orderDto.getHasBasePrice()) {
			// TODO 使用含有基础售价
			BeanUtils.copyProperties(orderDto, order);
		} else {
			// TODO 计算总价
			BeanUtils.copyProperties(orderDto, order, "total");
			Assert.notNull(optionDto, "选项不可为空");
			Double total =orderDto.getBasePrice()==null?0.00:orderDto.getBasePrice();
			
			List<SelectOption> options = optionRepo.findByServiceType(SelectOption.CAR_BEAUTIFY_SERVICE);
			for (SelectOption o : options) {
				// 洗涤剂
				if (o.getOptionType().equals(SelectOption.SHAMPOO_OPTION)) {
					if(o.getItemName().equals(optionDto.getShampooOption())) {
						total =+o.getPrice();
					}
				}
				// 打蜡选项
				if (o.getOptionType().equals(SelectOption.WAX_OPTION)) {
					if(o.getItemName().equals(optionDto.getWaxOption())) {
						total =+o.getPrice();
					}
				}
				// 内饰清洗选项
				if (o.getOptionType().equals(SelectOption.INTERNAL_WASH_OPTION)) {
					if(o.getItemName().equals(optionDto.getInternalwashOption())) {
						total =+o.getPrice();
					}
				}
			}
			
			
		}

		carBeautifyOrderRepo.saveAndFlush(order);
		return true;
	}

	@Override
	public Boolean submitCarMaintenanceOrder(OrderDTO orderDto, SelectOptionDTO optionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean submitCarRepairOrder(OrderDTO orderDto, SelectOptionDTO optionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean startWorkingOrder(String orderNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelOrder(String orderNo) {
		// TODO Auto-generated method stub
		return null;
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
