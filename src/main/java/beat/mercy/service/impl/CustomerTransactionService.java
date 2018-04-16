package beat.mercy.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import beat.mercy.common.exception.AccountTransactionException;
import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Order;
import beat.mercy.entity.state.LatestDateRange;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.OrderRepository;
import beat.mercy.service.ICustomerTransactionService;

@Service
public class CustomerTransactionService implements ICustomerTransactionService {

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	OrderRepository orderRepo;

	@Override
	public Page<Order> findCustomerOrders(Long customerId, LatestDateRange dateRange, PageableBuilder pageableBuilder) {
		if (dateRange.equals(LatestDateRange.all))
			return orderRepo.findByUserId(customerId, pageableBuilder.getPageable());

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
			Calendar calendar = Calendar.getInstance();

			Date now = sdf.parse(sdf.format(new Date()));

			calendar.setTime(now);

			switch (dateRange) {
			case latestMonth:
				calendar.add(Calendar.MONTH, -1);
				System.err.println(calendar.getTime());
				return orderRepo.findByUserIdAndCreateTimeAfter(customerId, calendar.getTime(),
						pageableBuilder.getPageable());
			case latestThreeMonth:
				calendar.add(Calendar.MONTH, -3);
				System.err.println(calendar.getTime());
				return orderRepo.findByUserIdAndCreateTimeAfter(customerId, calendar.getTime(),
						pageableBuilder.getPageable());
			case latestYear:
				calendar.add(Calendar.YEAR, -1);
				System.err.println(calendar.getTime());
				return orderRepo.findByUserIdAndCreateTimeAfter(customerId, calendar.getTime(),
						pageableBuilder.getPageable());

			default:
				return orderRepo.findByUserId(customerId, pageableBuilder.getPageable());
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}
