package com.School.controller;

import com.School.entities.Student;
import com.School.entities.Subjects;
import com.School.entities.Teacher;
import com.School.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getall")
    public void getAllStudents(){
        studentService.getAllStudets();

        System.out.println("Second Call:");
        studentService.getAllStudets();
    }

    @PostMapping("/add")
    public Student Add(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
