package beat.mercy.controller.staff;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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

	@RequestMapping(path = "/order/{serviceType}/submit", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> createServiceOrder(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		try {
			UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
			OrderDTO orderDto = JsonUtils.getObjectFromMap(paramMap.get("orderDto"), OrderDTO.class);
			SelectOptionDTO[] optionDtos = JsonUtils.getObjectFromMap(paramMap.get("optionDto"),
					SelectOptionDTO[].class);
			transactionService.submitOrder(staff.getId(), orderDto, optionDtos);
		} catch (OrderTransactionException e) {
			return RestJsonResult.getErrorResult(e.getMessage());
		}
		return RestJsonResult.getSuccessResult();
	}

	@RequestMapping(path = "/order/workList", method = RequestMethod.POST, consumes = "application/json")
	public Map<String, Object> myWorkList(@RequestBody Map<String, Object> paramMap, Authentication auth) {
		UserPrincipal staff = (UserPrincipal) auth.getPrincipal();
		PageableBuilder pageableBuilder = JsonUtils.getObjectFromMap(paramMap.get("pageableBuilder"),
				PageableBuilder.class);
		return RestJsonResult.getSuccessResult(staffQueryService.findMyWorkOrder(staff.getId(),
				ServiceProgress.valueOf((String) paramMap.get("progress")), pageableBuilder));
	}

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
}
