package com.School.repository;

import com.School.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subjects,Integer> {
}
