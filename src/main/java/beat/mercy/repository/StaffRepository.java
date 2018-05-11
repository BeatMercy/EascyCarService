package beat.mercy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>,JpaSpecificationExecutor<Staff> {
	public Staff findByUsername(String username);

	public Page<Staff> findByPhoneLikeOrRealNameLikeOrWeixinLike(String phone,String realName,String weixin,Pageable pageable);
}
