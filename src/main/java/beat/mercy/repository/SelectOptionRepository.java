package beat.mercy.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.option.SelectOption;
@Repository
public interface SelectOptionRepository extends JpaRepository<SelectOption, Long> {
	
	public List<SelectOption> findByServiceType(String serviceType);
	
	public List<SelectOption> findByServiceTypeAndEnable(String serviceType,Boolean enable);
	
	public Page<SelectOption> findByServiceType(String serviceType,Pageable pageable);
	
	@Query("select option from SelectOption option where option.serviceType=:serviceType and (option.name like :keyword or option.itemName like :keyword)")
	public Page<SelectOption> findByServiceTypeAndKeyword(@Param("serviceType") String serviceType,
			@Param("keyword") String keyword, Pageable pageable);
	
	public List<SelectOption> findByOptionType(String optionType);
	
	public List<SelectOption> findByServiceTypeAndOptionTypeAndEnable(String serviceType,String optionType,Boolean enable);
	
	public SelectOption findByNameAndItemName(String name,String itemName);
}