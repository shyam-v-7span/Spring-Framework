package com.example.springDemo.SetterInjection;

import com.example.springDemo.referenceInjection.Course;

public class Student {

    private Course course;

    private String studentName;
    private int rollNo;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("name added");
        this.studentName = studentName;
    }

    public void setCourse(Course course) {
        this.course = course;
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
