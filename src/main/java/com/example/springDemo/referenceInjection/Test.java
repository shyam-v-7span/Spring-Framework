package com.example.springDemo.referenceInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Test.class,args);

        // Get Student Bean
        Student student = context.getBean(Student.class);

        // Set Student Details
        student.setStudentName("Utsav");
        student.setRollNo(20);
        student.getCourse().setCourseName("OOP with java");

        // Print Student Details
        System.out.println(student);
        System.out.println("Course Name (Reference Injection): " + student.getCourse().getCourseName());
    }
}
