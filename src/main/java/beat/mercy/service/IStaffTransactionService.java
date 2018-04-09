package beat.mercy.service;

import beat.mercy.common.exception.OrderTransactionException;
import beat.mercy.entity.dto.OrderDTO;
import beat.mercy.entity.dto.SelectOptionDTO;

public interface IStaffTransactionService {

	/**
	 * 员工提交订单
	 * author: Mercy Wu(a3049)
	 * 2018年4月8日 下午10:49:41
	 * @param staffId
	 * @param orderDto
	 * @param optionDtos
	 * @return
	 * @throws OrderTransactionException
	 */
	public Boolean submitOrder(Long staffId,OrderDTO orderDto, SelectOptionDTO[] optionDtos)throws OrderTransactionException;
 
	/**
	 * 
	 * author: Mercy Wu(a3049)
	 * 2018年4月4日 下午6:08:26
	 * @param OrderDto
	 * @param optionDto
	 * @return
	 */
	public Boolean submitCarRepairOrder(OrderDTO orderDto, SelectOptionDTO[] optionDtos);
	
	/**
	 * 开始进行某订单的工作 进度转为WORKING
	 * author: Mercy Wu(a3049)
	 * 2018年4月4日 下午5:58:38
	 * @param orderNo 订单编号
	 * @return
	 */
	public Boolean startWorkingOrder(Long staffId,String orderNo)throws OrderTransactionException;
	
	/**
	 * 取消订单 状态转为CANCELED
	 * author: Mercy Wu(a3049)
	 * 2018年4月4日 下午6:06:13
	 * @param orderNo
	 * @return
	 */
	public Boolean cancelOrder(Long staffId, String orderNo) throws OrderTransactionException;
	
	/**
	 * 完成服务 进度转为 FINISHED 
	 * author: Mercy Wu(a3049)
	 * 2018年4月4日 下午6:05:12
	 * @param orderNo
	 * @return
	 */
	public Boolean finishOrderService(String orderNo);
	
	/**
	 * 完成订单 订单状态转为FISISHED
	 * author: Mercy Wu(a3049)
	 * 2018年4月4日 下午6:05:47
	 * @param orderNo
	 * @return
	 */
	public Boolean finishOrder(String orderNo);
	
	
	
}
