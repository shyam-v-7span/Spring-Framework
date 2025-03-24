package com.School.controller;

import com.School.entities.Student;
import com.School.entities.Teacher;
import com.School.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> getAllStudents(){
        return teacherService.getAllTeachers();
    }

    @PostMapping("/teachers/add")
    public Teacher AddTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
}
