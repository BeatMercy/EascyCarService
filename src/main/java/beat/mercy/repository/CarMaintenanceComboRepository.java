package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.CarMaintenanceCombo;

@Repository
public interface CarMaintenanceComboRepository extends JpaRepository<CarMaintenanceCombo, Long> {

}
