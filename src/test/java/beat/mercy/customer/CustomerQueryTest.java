package beat.mercy.customer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import beat.mercy.EasyCarServiceApplicationTests;
import beat.mercy.entity.Customer;
import beat.mercy.repository.CustomerRepository;

public class CustomerQueryTest extends EasyCarServiceApplicationTests {

	@Autowired
	CustomerRepository customerRepo;

	@Test
	public void findUserByCar() {
		Customer customer = customerRepo.findByVehiclesPlateNo("粤S63B87");
		if (customer == null) {
			System.err.println("null");
		} else
			System.err.println(customer.getRealName());
	}
}
