package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.CarBeautifyCombo;

@Repository
public interface CarBeautifyComboRepository extends JpaRepository<CarBeautifyCombo, Long> {

}
