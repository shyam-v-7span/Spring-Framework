package com.example.springDemo.SetterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // Marks this class as a configuration class
@ComponentScan(basePackages = "com.example.springDemo.SetterInjection")
public class AppConfig {
    // manually added a bean
    @Bean(name = "myStudent")
    public Student student() {
        Student student = new Student();
        student.setStudentName("Utsav");
        student.setRollNo(20);
        return student;
    }

}
