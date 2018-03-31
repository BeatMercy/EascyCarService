package beat.mercy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Advertisement;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,Long> {
	public Advertisement findByTitle(String title);
}
