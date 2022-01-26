package com.tc.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	/*@GetMapping("/hello")
    public String hello(){
	    return "hello";
    }

	@GetMapping("/students")
	public List<String> fetchStudents(){

        List<String> students = new ArrayList<>();

        students.add("Anup");
        students.add("Rahul");

	    return students;
    }

    @GetMapping("/addition")
    public int addition(){
	    return 1+2;
    }*/

}
