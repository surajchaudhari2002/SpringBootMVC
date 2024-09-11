package com.mvcapplication.firstmvc.controller;

import com.mvcapplication.firstmvc.entities.Employee;
import com.mvcapplication.firstmvc.service.EmployeeService;
import com.mvcapplication.firstmvc.service.ResponseEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeConroller {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEmployee insertEmployee(@RequestBody Employee employee){
       ResponseEmployee responseEmployee=employeeService.insertdata(employee);
       return responseEmployee;
    }

    @GetMapping("/getemployees/{id}")
    public ResponseEmployee getEmployeeByid(@PathVariable int id){
     return   employeeService.getEmployeeByid(id);

    }

    @GetMapping("/getallemployee")
    public List<Employee> getAllemployee(){
        return employeeService.getAllemployee();
    }
}
