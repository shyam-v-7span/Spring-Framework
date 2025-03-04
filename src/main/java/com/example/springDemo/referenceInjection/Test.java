package com.example.springDemo.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ReferenceInjectionConfig.xml");
        Student student = (Student) context.getBean("studentReference");
        System.out.println("Name : "+student.getStudentName());
        System.out.println("Roll no : "+student.getRollNo());
        System.out.println("get Course name by reference :  "+student.getCourse().getCourseName());
    }
}
