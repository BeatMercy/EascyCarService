package beat.mercy.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beat.mercy.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	public Department findByName(String name);
	
	public List<Department> findByNameLike(String name);
	public List<Department> findByNameLike(String name,Pageable pageable);
}
