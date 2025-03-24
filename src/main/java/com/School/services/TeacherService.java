package com.School.services;

import com.School.entities.Student;
import com.School.entities.Teacher;
import com.School.repository.StudentRepository;
import com.School.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Transactional
    public List<Teacher> getAllTeachers(){
        List<Teacher> teacherList= teacherRepository.findAll();
        return teacherList;
    }

    public Teacher addTeacher(Teacher teacher){
       return teacherRepository.save(teacher);
    }
}
