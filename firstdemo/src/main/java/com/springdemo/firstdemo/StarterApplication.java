package com.springdemo.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class StarterApplication {
    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(StarterApplication.class);
        ConfigurableApplicationContext container= springApplication.run();
        Student student=container.getBean(Student.class);
        System.out.println(student);
//        student.setStudentName("Suraj");
//        System.out.println(student.getStudentName());
    }

}
