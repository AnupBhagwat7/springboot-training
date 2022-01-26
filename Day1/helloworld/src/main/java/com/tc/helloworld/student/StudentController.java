package com.tc.helloworld.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    /*public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }*/

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> students =  studentService.getStudents();
        return students;
    }
}
