package cuongnguyen.tt.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeReponsitory extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();
}
