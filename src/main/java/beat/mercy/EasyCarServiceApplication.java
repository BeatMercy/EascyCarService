package beat.mercy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.entity.Advertisement;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Staff;
import beat.mercy.entity.base.BaseCarService;
import beat.mercy.entity.rbac.Authority;
import beat.mercy.entity.rbac.Role;
import beat.mercy.repository.AdvertisementRepository;
import beat.mercy.repository.AuthorityRepository;
import beat.mercy.repository.CarServiceRepository;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.RoleRepository;
import beat.mercy.repository.StaffRepository;

@SpringBootApplication
@RestController
@EnableScheduling // 启用定时任务
public class EasyCarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyCarServiceApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public CommandLineRunner runWith(
			AdvertisementRepository advertisementRepository,
			CarServiceRepository carServiceRepository,
			AuthorityRepository authorityRepository,
			RoleRepository roleRepository,
			StaffRepository staffRepository,
			CustomerRepository customerRepository,
			BCryptPasswordEncoder bCryptPsswordEncoder) {
		return(args) -> {
			// 设权
			authorityRepository.save( new Authority("NORMAL_USER"));
			authorityRepository.save(new Authority("NORMAL_STAFF"));
			authorityRepository.save(new Authority("NORMAL_ADMIN"));
			
			Set<Authority> userASet = new HashSet<>();
			Set<Authority> staffASet = new HashSet<>();
			Set<Authority> adminASet = new HashSet<>();
			userASet.add(authorityRepository.findByName("NORMAL_USER"));
			staffASet.addAll(
					Arrays.asList(authorityRepository.findByName("NORMAL_STAFF"),
					authorityRepository.findByName("NORMAL_USER"))
					);
			adminASet.addAll(
					Arrays.asList(authorityRepository.findByName("NORMAL_ADMIN"),
					authorityRepository.findByName("NORMAL_USER")));
			// 设角色
			roleRepository.save(new Role("ROLE_USER",userASet));
			roleRepository.save(new Role("ROLE_STAFF",staffASet));
			roleRepository.save(new Role("ROLE_ADMIN",adminASet));
			
			Customer customer = new Customer();
			customer.setUsername("mercy");
			customer.setPassword(bCryptPasswordEncoder().encode("123456"));
			customer.getRoles().add(roleRepository.findByName("ROLE_USER"));
			
			Staff staff = new Staff();
			staff.setUsername("frontStaff1");
			staff.setPassword(bCryptPasswordEncoder().encode("123456"));
			staff.getRoles().add(roleRepository.findByName("ROLE_STAFF"));
			
			BaseCarService baseCs0 = new BaseCarService();
			baseCs0.setName("小型车洗车服务");
			baseCs0.setDescription("为车型在xxxx一下的车提供洗车服务");
			baseCs0.setServePrice(35.0d);
			
			BaseCarService baseCs1 = new BaseCarService();
			baseCs1.setName("小型车保养服务");
			baseCs1.setDescription("为车型在xxxx一下的车提供洗车服务");
			baseCs1.setServePrice(435.0d);
			
			BaseCarService baseCs2 = new BaseCarService();
			baseCs2.setName("大型车洗车服务");
			baseCs2.setDescription("为车型在xxxx一下的车提供洗车服务");
			baseCs2.setServePrice(655.0d);
			carServiceRepository.save(Arrays.asList(baseCs0,baseCs1,baseCs2));
			BaseCarService selected = carServiceRepository.findOne(2L);
			selected.setName("小型车保养服务[优惠]");
			carServiceRepository.save(selected);
			
			
			// 广告模块
			Advertisement ad = new Advertisement();
			ad.setTitle("测试的广告");
			ad.setDescription("今日特价：搜索热门洗车");
			ad.setImgUrl("/img/homeAd/1");
			ad.setSequence(1);
			ad.setIsShow(true);
			Advertisement ad2 = new Advertisement();
			ad2.setTitle("测试的广告2");
			ad2.setDescription("今日特价：搜索热门保养");
			ad2.setImgUrl("/img/homeAd/2");
			ad2.setSequence(1);
			ad2.setIsShow(true);
			
			advertisementRepository.save(Arrays.asList(ad,ad2));
			customerRepository.save(customer);
			staffRepository.save(staff);
			
			 
			
		};
	}
}

