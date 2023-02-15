package com.example.practice;

import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepo;
import com.example.practice.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentsServiceTests {

//    @Autowired
//    StudentService StudentService;
    @Mock
    StudentRepo StudentRepo;

    @InjectMocks
    StudentService StudentService;

    Student student;

    @BeforeEach
    public void setUp() {
        this.student = new Student(8, "John", 17);
    }

        @Test
        public void testGetStudents(){
        List<Student> StudentList = new ArrayList<>();
        StudentList.add(new Student(6, "John",18));
        StudentList.add(new Student(7, "Sena",14));
        when(StudentRepo.findAll()).thenReturn(StudentList);
        List<Student> result = StudentService.getStudents();
        assertNotNull(StudentList);
        assertEquals(2, result.size());
        }

    @Test
    public void testCreateStudent() {
        Student student = new Student(1, "Karishma" , 25);

        when(StudentRepo.existsById(student.getId())).thenReturn(false);

        String result = StudentService.createStudent(student);
        System.out.println(result);

        assertEquals("Student details are saved.",result);
    }

    @Test
    public void testSuccessfulUpdateEmployee()
    {
        // Mock data
        Student student = new Student();
        student.setId(1);
        student.setName("John Doe");
        student.setAge(20);

        when(StudentRepo.findById(1)).thenReturn(Optional.of(student));

        String updatedStudent = StudentService.updateStudent(new Student(1, "Jane Doe", 22));

        assertEquals("Student details are updated.", updatedStudent);
    }

    @Test
    public void testUnsuccessfulUpdateEmployee()
    {
        when(StudentRepo.findById(this.student.getId())).thenReturn(Optional.empty());

        String result = StudentService.updateStudent(this.student);

        assertEquals( String.format("Student with %d doesn't exist to update.", student.getId()), result);
    }

    @Test
    public void testSuccessfulDeleteStudent()
    {
        when(StudentRepo.existsById(this.student.getId())).thenReturn(true);

        String result = StudentService.deleteStudent(this.student.getId());
        System.out.println(result);

        assertEquals(String.format("Student with %d deleted successfully.",student.getId()) , result);
    }

    @Test
    public void testUnsuccessfulDeleteEmployee()
    {
        when(StudentRepo.existsById(this.student.getId())).thenReturn(false);

        String result = StudentService.deleteStudent(this.student.getId());
        System.out.println(result);

        assertEquals(String.format("Student with %d doesn't exist to delete.", student.getId()) , result);
    }

    @Test
    public void testGetStudentByID()
    {
        when(StudentRepo.findById(8)).thenReturn(Optional.of(student));

        Student result = StudentService.getStudentByID(8);
        System.out.println(result);

        assertEquals("John" , result.getName());
        assertEquals((Object)17, result.getAge());
    }

}
