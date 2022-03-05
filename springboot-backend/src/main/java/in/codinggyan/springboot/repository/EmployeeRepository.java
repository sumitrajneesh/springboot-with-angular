package in.codinggyan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codinggyan.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	
	

}
