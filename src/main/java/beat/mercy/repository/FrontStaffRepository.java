package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.FrontStaff;
@Repository
public interface FrontStaffRepository extends JpaRepository<FrontStaff, Long> {

}
