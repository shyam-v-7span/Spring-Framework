package com.School.controller;

import com.School.entities.Subjects;
import com.School.entities.Teacher;
import com.School.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping("/getall")
    public List<Subjects> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @PostMapping("/add")
    public Subjects AddSubject(@RequestBody Subjects subjects){
        return subjectService.addSubject(subjects);
    }

}
