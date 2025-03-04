package com.example.springDemo.SetterInjection;

import com.example.springDemo.SetterInjection.Collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");

        //setter injection
        Student student = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(student2);

        //setter injection on collection injection
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1.getEmployeeNames());
        System.out.println(employee1.getEmployeeIds());
    }
}
