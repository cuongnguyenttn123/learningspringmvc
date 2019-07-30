package cuongnguyen.tt.service;

import cuongnguyen.tt.entity.Employee;
import cuongnguyen.tt.reponsitory.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeReponsitory employeeReponsitory;

    public List<Employee> findAll(){
        return employeeReponsitory.findAll();
    }
}
