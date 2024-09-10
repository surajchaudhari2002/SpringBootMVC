package com.mvcapplication.firstmvc.controller;

import com.mvcapplication.firstmvc.entities.Employee;
import com.mvcapplication.firstmvc.service.EmployeeService;
import com.mvcapplication.firstmvc.service.ResponseEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeConroller {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEmployee insertEmployee(@RequestBody Employee employee){
       ResponseEmployee responseEmployee=employeeService.insertdata(employee);
       return responseEmployee;
    }
}
