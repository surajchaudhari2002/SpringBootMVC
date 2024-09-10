package com.mvcapplication.firstmvc.Repositery;

import com.mvcapplication.firstmvc.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //used various method of jpa to perform data opration in database
public interface EmployeeRepositery extends JpaRepository<Employee, Integer> {

}
