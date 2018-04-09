package beat.mercy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Vehicle;
import beat.mercy.repository.AccountRepository;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.SelectOptionRepository;
import beat.mercy.repository.VehicleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyCarServiceApplicationTests {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private VehicleRepository vehicleRepository;

	@Autowired
	private SelectOptionRepository optionRepo;
	
	@Test
	public void contextLoads() {
		vehicleRepository.findAll().forEach(child -> {
			child.getPlateNo();
		});
		vehicleRepository.findByOwnerId(1L).forEach(child -> {
			System.err.println("通过userId查找：" + child.getPlateNo());
		});
	}
	

	@Test
	public void testFindByPlateNo() {
		Customer user = new Customer();
		Vehicle v = new Vehicle();
		v.setPlateNo("粤S63B87");
		user.setUsername("MercyWu");
		user.getVehicles().add(v);
		v.setOwner(user);
		Long id = customerRepository.save(user).getId();
		System.err.println(id);
		System.err.println(customerRepository.findByVehiclesPlateNo("粤S63B87").getUsername());
		vehicleRepository.findByOwnerId(id).forEach(child -> {
			System.err.println("通过userId查找：" + child.getPlateNo());
		});
		;
	}
}
