package com.mvcapplication.firstmvc.service;

import com.mvcapplication.firstmvc.Repositery.EmployeeRepositery;
import com.mvcapplication.firstmvc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepositery employeeRepositery;
    public ResponseEmployee insertdata(Employee employee){
        if(employee.getSalary()>=50000) {
            Employee employee1 = employeeRepositery.save(employee);//use to save object in databse
            return new ResponseEmployee(employee1,"Employee saved Sucessfully..!");
        }
        else{
            return new ResponseEmployee(null,"Salary should be more than 50000");
        }
    }

    public ResponseEmployee getEmployeeByid(int id){
        Optional<Employee> employee =employeeRepositery.findById(id);
        if(employee.isPresent()){
            return new ResponseEmployee(employee.get(),"Data Fetched Sucessfully..!");
        }
       else{
           return new ResponseEmployee(null,"Employee not found for id "+id);
        }
    }

    public List<Employee> getAllemployee(){
        List<Employee> employees= employeeRepositery.findAll();
        return employees;
    }

    public List<Employee> getemployeeBetween(double min , double max){
        List<Employee> list= employeeRepositery.findBySalaryBetween(min , max);
        return list;
    }
}
