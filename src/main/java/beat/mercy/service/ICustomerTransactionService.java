package beat.mercy.service;


import org.springframework.data.domain.Page;

import beat.mercy.common.exception.AccountTransactionException;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Order;
import beat.mercy.entity.state.LatestDateRange;

public interface ICustomerTransactionService {

	public Page<Order> findCustomerOrders(Long customerId,LatestDateRange dateRange,PageableBuilder pageableBuilder);
}
