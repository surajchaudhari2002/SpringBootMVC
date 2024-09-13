package com.springdemo.firstdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Student {
    String StudentName;

    public Student(String studentName) {
        super();
        this.StudentName = studentName;
    }
    public Student(){
super();
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
