package com.example.springDemo.referenceInjection;

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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString(){
        return "Name : "+studentName +" , Roll number : " +rollNo;
    }


}
