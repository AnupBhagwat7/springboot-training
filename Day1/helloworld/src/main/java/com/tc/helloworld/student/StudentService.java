package com.tc.helloworld.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1L, "Anup", "assass@ssdsd.com", LocalDate.of(1989, 02,28), 32);
        Student s2 = new Student(2L, "Rahul", "asssaasasweew@ssdsd.com", LocalDate.of(1986, 02,28), 36);

        students.add(s1);
        students.add(s2);

        return students;
    }

}
