package cuongnguyen.tt.service;

import cuongnguyen.tt.entity.Employee;
import cuongnguyen.tt.entity.UserEntity;
import cuongnguyen.tt.reponsitory.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeReponsitory employeeReponsitory;

    public List<Employee> findAll(){
        return employeeReponsitory.findAll();
    }
    public Employee findEm(String s, String name){
        return employeeReponsitory.findByAddRe(s, name);
    }
    public UserEntity findEm12(){
        return employeeReponsitory.findByName1();
    }
    public Employee findEm2(String s, String name){
        return employeeReponsitory.findByNameAndAddRess2(s, name);
    }
    public Page<Employee> findEmployee(Pageable pageable) {
        return employeeReponsitory.findEmployee(pageable);
    }
}
