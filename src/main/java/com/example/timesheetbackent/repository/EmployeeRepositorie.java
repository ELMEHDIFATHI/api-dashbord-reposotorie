package com.example.timesheetbackent.repository;

import com.example.timesheetbackent.model.Employee;
import com.example.timesheetbackent.model.EmployeeDev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepositorie extends JpaRepository<Employee,Long> {

    List<Employee> findAll();
    Employee findByUsername(String username);

    @Query(value = "SELECT COUNT(*) FROM employee" , nativeQuery = true)
    Integer EmployeeTotal();

    @Query(value = "SELECT COUNT(*) FROM developer" , nativeQuery = true)
    Integer EmployeeDevTotal();

    @Query(value = "SELECT COUNT(*) FROM manager" , nativeQuery = true)
    Integer EmployeeMangerTotal();


}
