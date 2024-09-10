package com.mvcapplication.firstmvc.service;

import com.mvcapplication.firstmvc.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEmployee {
    private Employee employee;
    private String msg;
}
