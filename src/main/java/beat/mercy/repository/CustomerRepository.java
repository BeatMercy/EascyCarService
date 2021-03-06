package beat.mercy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {

	Customer findByUsername(String username);
	
	Customer findByPhone(String phone);
	
	Customer findByVehiclesPlateNo(String plateNo);
	
	Page<Customer> findByPhoneLikeOrRealNameLikeOrWeixinLike(String phone,String realName,String weixin,Pageable pageable);

}
