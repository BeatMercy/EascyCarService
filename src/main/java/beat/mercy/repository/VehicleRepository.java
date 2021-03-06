package beat.mercy.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>,JpaSpecificationExecutor<Vehicle> {
	public Vehicle findByPlateNo(String plateNo);
	
	public List<Vehicle> findByOwnerId(Long id);
	
	public List<Vehicle> findByOwnerUsername(String username);

	public Page<Vehicle> findByPlateNoLikeOrBrandLikeOrOwnerRealNameLike(String plateNo,String brand,String ownerRealName,Pageable pageable);
}
