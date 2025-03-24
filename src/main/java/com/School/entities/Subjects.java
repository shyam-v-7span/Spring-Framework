package com.School.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int id;
    @Column(name = "subject_name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_subjects", // Join Table
            joinColumns = @JoinColumn(name = "subject_id"), // FK for Subject
            inverseJoinColumns = @JoinColumn(name = "student_id") // FK for Student
    )
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
