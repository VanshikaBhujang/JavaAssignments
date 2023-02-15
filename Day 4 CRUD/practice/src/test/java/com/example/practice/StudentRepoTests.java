package com.example.practice;

import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepoTests {

    @Autowired
    StudentRepo StudentRepo;

    @Test
    public void testFindByAgeGreaterThan(){
        Student s1 = new Student(1, "Nisha" , 19);
        Student s2 = new Student(2, "Risha" , 18);

        StudentRepo.save(s1);
        StudentRepo.save(s2);

        List<Student> students = StudentRepo.findByAgeGreaterThanEqual(18);
        for (Student student : students) {
            System.out.println(student);
        }
        assertNotNull(students);
        assertEquals(3,students.size());
    }

    @Test
    public void testFindByNameEndingWith(){
        Student s1 = new Student(1, "Nisha" , 19);
        Student s2 = new Student(2, "Risha" , 18);
        StudentRepo.save(s1);
        StudentRepo.save(s2);

        List<Student> students = StudentRepo.findBynameEndingWith("a");

        assertNotNull(students);
        assertEquals(4,students.size());
    }

}
