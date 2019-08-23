package cuongnguyen.tt.reponsitory;

import cuongnguyen.tt.entity.Employee;
import cuongnguyen.tt.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface EmployeeReponsitory extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();

    @Query("SELECT e FROM Employee e")
    Page<Employee> findEmployee(Pageable pageable);

    @Query("select e from Employee e where e.addRess = ?1 and e.name = ?2")
    Employee findByAddRe(String s, String name);

    @Query("select e from Employee e where e.addRess = :address and e.name = :name")
    Employee findByNameAndAddRess2(@Param("address")String add, @Param("name")String name);

    @Query("select new UserEntity(e.id, e.userName, e.passWord, e.enabled) from UserEntity as e join Employee as a on e.id = a.age where a.age = 14")
    UserEntity findByName1();

}
