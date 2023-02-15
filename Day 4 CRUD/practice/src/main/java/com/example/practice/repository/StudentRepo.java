package com.example.practice.repository;

import com.example.practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    //Custom JPA Methods
    List<Student> findByAgeGreaterThanEqual(Integer age);
    List<Student> findBynameEndingWith(String end);
}
