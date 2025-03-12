package com.example.springDemo.SetterInjection;

import com.example.springDemo.SetterInjection.Collections.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //setter injection
        Student student = context.getBean("student",Student.class);
        // call custom bean
        Student student1 = context.getBean("myStudent",Student.class);
        Employee employee = context.getBean(Employee.class);

        student.setStudentName("shyam");
        student.setRollNo(50);

        //setter injection on collection injection
        employee.setEmployeeNames(Arrays.asList("Shyam","Ram","om"));
        employee.setEmployeeIds(new HashSet<>(Arrays.asList(1,2,3)));

        System.out.println(student);
        System.out.println(student1);
        System.out.println(employee);
    }
}
