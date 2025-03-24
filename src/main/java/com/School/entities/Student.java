package com.School.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "student_name")
    private String name;
    @Column(name = "roll_no")
    private int rollNo;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @JsonIgnoreProperties("students")
    private Teacher teacher;

    @ManyToMany(mappedBy = "students",cascade = CascadeType.MERGE) // "students" refers to the field in Subject
    @JsonIgnoreProperties("students")
    private List<Subjects> subjects;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("student")
    private Icard icard;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    public Icard getIcard() {
        return icard;
    }

    public void setIcard(Icard icard) {
        this.icard = icard;
    }
}
