package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.MaintenanceServiceRecord;

@Repository
public interface MaintenanceServiceRecordRepository extends JpaRepository<MaintenanceServiceRecord, Long>, JpaSpecificationExecutor<MaintenanceServiceRecord> {

}
