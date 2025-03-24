package com.School.repository;

import com.School.entities.Student;
import com.School.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
