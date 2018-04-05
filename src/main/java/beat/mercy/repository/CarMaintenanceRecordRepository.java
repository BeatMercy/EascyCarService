package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.CarMaintenanceRecord;

@Repository
public interface CarMaintenanceRecordRepository extends JpaRepository<CarMaintenanceRecord, Long>{

}
