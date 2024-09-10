package com.mvcapplication.firstmvc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="employees")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private int id;

    private  String emp_name;

    @Column(name="emp_adress")
    private  String adress;

    private int emp_salary;
}
