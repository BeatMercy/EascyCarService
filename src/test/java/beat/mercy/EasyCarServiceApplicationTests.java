package beat.mercy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import beat.mercy.repository.AccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyCarServiceApplicationTests {

	@Autowired
	private AccountRepository accountRepository;
	
	@Test
	public void contextLoads() {
		accountRepository.findAll().forEach(child->{
			child.getRealName();
		});
	}

}
