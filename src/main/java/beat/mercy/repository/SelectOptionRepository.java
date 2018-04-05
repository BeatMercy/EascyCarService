package beat.mercy.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.option.SelectOption;
@Repository
public interface SelectOptionRepository extends JpaRepository<SelectOption, Long> {
// TODO 添加缓存处理
	@Cacheable(value = "carServiceOption", key="#p0")
	public List<SelectOption> findByServiceType(String serviceType);
	
	public List<SelectOption> findByOptionType(String optionType);
	
	public List<SelectOption> findByServiceTypeAndOptionType(String serviceType,String optionType);
}