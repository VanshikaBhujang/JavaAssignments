package com.example.practice.service;

import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    //Create New student details

    public String createStudent(Student student){
        if(this.studentRepo.existsById(student.getId())){
            return "Student already exists";
        }
        else{
            this.studentRepo.save(student);
            return "Student details are saved.";
        }
    }

    //get all student details

    public List<Student> getStudents(){
        return this.studentRepo.findAll();

    }

    //delete student
    public String deleteStudent(int id)
    {
        if(this.studentRepo.existsById(id))
        {
            this.studentRepo.deleteById(id);
            return String.format("Student with %d deleted successfully.",id);
        }
        else{
            return String.format("Student with %d doesn't exist to delete.", id);
        }

    }
    //update student
    public String updateStudent(Student student)
    {
        Optional<Student> optionalStudent = studentRepo.findById(student.getId());

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            studentRepo.save(existingStudent);
            return "Student details are updated.";
        } else {
            return String.format("Student with %d doesn't exist to update.", student.getId());
        }
    }

    //get student by id
    public Student getStudentByID(int id)
    {
        return this.studentRepo.findById(id).get();
    }

    public List<Student> getAgeGreaterThan(int age){
        return this.studentRepo.findByAgeGreaterThanEqual(age);
    }
    public List<Student> getNameEndingWith(String end){
        return this.studentRepo.findBynameEndingWith(end);
    }

}
