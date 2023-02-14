package com.example.practice.controller;

import com.example.practice.model.Student;
import com.example.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
        return this.studentService.getStudents();
    }

    @PostMapping("/createstudent")
    public String createStudent(@RequestBody Student student){
        return this.studentService.createStudent(student);
    }

    //delete
    @DeleteMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable("id") int id) { return this.studentService.deleteStudent(id);}

    //update
    @PutMapping("/updatestudent")
    public String updateStudent(@RequestBody Student student) {return this.studentService.updateStudent(student);}

    //getbyid
    @GetMapping("/studentByID/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return this.studentService.getStudentByID(id);
    }
}
