package com.example.springDemo.referenceInjection;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
