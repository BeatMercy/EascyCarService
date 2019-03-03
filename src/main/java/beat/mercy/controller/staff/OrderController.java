package beat.mercy.controller.staff;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.exception.OrderTransactionException;
import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.conf.security.UserPrincipal;
import beat.mercy.entity.dto.OrderDTO;
import beat.mercy.entity.dto.SelectOptionDTO;
import beat.mercy.entity.state.OrderState;
import beat.mercy.entity.state.ServiceProgress;
import beat.mercy.service.IStaffQueryService;
import beat.mercy.service.IStaffTransactionService;

@RestController
public class OrderController {

	@Autowired
	IStaffTransactionService transactionService;
	@Autowired
	IStaffQueryService staffQueryService;

	/**
	 * 员工创建订单 <br>
	 * 
	 * author: Mercy Wu(a3049) 2018年4月10日 下午5:55:17
	 * 
	 * @param paramMap
	 * @param auth
	 * @return
	 */
	@Secured({ "ROLE_STAFF", "ROLE_ADMIN" })
	@RequestMapping(path = "/order/{serviceType}/submit", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> createServiceOrder(@RequestBody Map<String, Object> paramMap, Authentication auth,
			@PathVariable("serviceType") String serviceType) {
		UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
		try {
			switch (serviceType) {
			case "repair":
				OrderDTO orderDto = JsonUtils.getObjectFromMap(paramMap.get("orderDto"), OrderDTO.class);
				SelectOptionDTO[] optionDtos = JsonUtils.getObjectFromMap(paramMap.get("optionDto"),
						SelectOptionDTO[].class);
				transactionService.submitCarRepairOrder(staff.getId(), orderDto, optionDtos);
				return RestJsonResult.getSuccessResult(optionDtos);
			}

			OrderDTO orderDto = JsonUtils.getObjectFromMap(paramMap.get("orderDto"), OrderDTO.class);
			SelectOptionDTO[] optionDtos = JsonUtils.getObjectFromMap(paramMap.get("optionDto"),
					SelectOptionDTO[].class);
			transactionService.submitOrder(staff.getId(), orderDto, optionDtos);
		} catch (OrderTransactionException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		return RestJsonResult.getSuccessResult();
	}

	/**
	 * 员工获取属于自己的工作订单<br>
	 * author: Mercy Wu(a3049) 2018年4月10日 下午5:56:34
	 * 
	 * @param paramMap
	 * @param auth
	 * @return
	 */
	@RequestMapping(path = "/order/workList", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> myWorkList(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
		PageableBuilder pageableBuilder = JsonUtils.getObjectFromMap(paramMap.get("pageableBuilder"),
				PageableBuilder.class);
		return RestJsonResult.getSuccessResult(staffQueryService.findMyWorkOrder(staff.getId(),
				ServiceProgress.valueOf((String) paramMap.get("progress")), pageableBuilder));
	}

	/**
	 * 前台员工获取当前未结账的订单<br>
	 * 
	 * author: Mercy Wu(a3049) 2018年4月10日 下午5:57:56
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping(path = "/order/searchUnpay", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> findUnpayOrder(@RequestBody Map<String, Object> paramMap) {
		String plateAbbr = (String) paramMap.get("plateAbbr");
		String plateString = (String) paramMap.get("plateString");
		String plateNo = plateAbbr + plateString.toUpperCase();
		System.err.println(plateNo);
		return RestJsonResult.getSuccessResult(staffQueryService.findOrderUnpageForCashier(plateNo + "%"));
	}

	@RequestMapping(path = "/order/confirmPay", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> confirmPayOrder(@RequestBody Map<String, Object> paramMap) {
		try {
			String orderNo = (String) paramMap.get("orderNo");
			transactionService.finishOrder(orderNo);
			return RestJsonResult.getSuccessResult();
		} catch (OrderTransactionException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
	}

	/**
	 * 技工开始自己订单业务<br>
	 * 
	 * author: Mercy Wu(a3049) 2018年4月10日 下午5:58:35
	 * 
	 * @param paramMap
	 * @param auth
	 * @return
	 */
	@RequestMapping(path = "/order/startWork", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> startWork(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		try {
			UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
			String orderNo = (String) paramMap.get("orderNo");
			transactionService.startWorkingOrder(staff.getId(), orderNo);
		} catch (OrderTransactionException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		return RestJsonResult.getSuccessResult();
	}

	/**
	 * 员工取消订单<br>
	 * author: Mercy Wu(a3049) 2018年4月10日 下午5:59:10
	 * 
	 * @param paramMap
	 * @param auth
	 * @return
	 */

	@RequestMapping(path = "/order/cancelWork", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> cancelWork(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		try {
			UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
			String orderNo = (String) paramMap.get("orderNo");
			transactionService.cancelOrder(staff.getId(), orderNo);
		} catch (OrderTransactionException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		return RestJsonResult.getSuccessResult();
	}

	/**
	 * 员工完成作业，等待客户验收或付款<br>
	 * author: Mercy Wu(a3049) 2018年4月10日 下午5:59:30
	 * 
	 * @param paramMap
	 * @param auth
	 * @return
	 */
	@RequestMapping(path = "/order/finishWork", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> finishWork(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		try {
			UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
			String orderNo = (String) paramMap.get("orderNo");
			transactionService.finishOrderService(staff.getId(), orderNo);
		} catch (OrderTransactionException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		return RestJsonResult.getSuccessResult();
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(path = "/order/resetTotal", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> resetOrderTotal(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		try {
			Map<String, Object> data = (HashMap<String, Object>) paramMap.get("data");
			List<Map<String, Object>> inputFields = (List<Map<String, Object>>) paramMap.get("inputFields");

			String orderNo = (String) data.get("orderNo");
			Double resetTotal = Double.valueOf(String.valueOf(inputFields.get(0).get("value")));
			String note = String.valueOf(inputFields.get(1).get("value"));
			transactionService.resetOrderTotalByCashier(orderNo, resetTotal, note);
		} catch (Exception e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		return RestJsonResult.getSuccessResult();
	}

}
