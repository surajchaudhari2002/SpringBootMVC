package com.mvcapplication.firstmvc.service;

import com.mvcapplication.firstmvc.Repositery.EmployeeRepositery;
import com.mvcapplication.firstmvc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepositery employeeRepositery;
    public ResponseEmployee insertdata(Employee employee){
        if(employee.getEmp_salary()>=50000) {
            Employee employee1 = employeeRepositery.save(employee);//use to save object in databse
            return new ResponseEmployee(employee1,"Employee saved Sucessfully..!");
        }
        else{
            return new ResponseEmployee(null,"Salary should be more than 50000");
        }
    }
}
