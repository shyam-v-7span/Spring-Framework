package com.School.services;

import com.School.entities.Student;
import com.School.entities.Subjects;
import com.School.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //@Transactional
    public List<Student> getAllStudets(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }


}
