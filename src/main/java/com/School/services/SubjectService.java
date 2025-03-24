package com.School.services;

import com.School.entities.Subjects;
import com.School.entities.Teacher;
import com.School.repository.SubjectsRepository;
import com.School.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectsRepository subjectsRepository;

    public List<Subjects> getAllSubjects(){
        return subjectsRepository.findAll();
    }

    public Subjects addSubject(Subjects subjects){
        return subjectsRepository.save(subjects);
    }


}
