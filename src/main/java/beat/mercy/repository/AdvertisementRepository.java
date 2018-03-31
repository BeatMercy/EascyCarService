package beat.mercy.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Advertisement;
import beat.mercy.entity.state.AdvertiseLocation;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,Long> {
	public Advertisement findByTitle(String title);
	
	public List<Advertisement>  findByLocationAndIsShow(AdvertiseLocation location,Boolean isShow,Pageable pageable);
}
