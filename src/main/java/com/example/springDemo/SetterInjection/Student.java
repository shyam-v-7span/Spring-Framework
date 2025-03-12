package com.example.springDemo.SetterInjection;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String studentName;
    private int rollNo;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("name added");
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "Name : "+studentName +" , Roll number : " +rollNo;
    }


}
