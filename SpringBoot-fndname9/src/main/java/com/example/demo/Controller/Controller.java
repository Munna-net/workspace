package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Serice.StudentService;

@RestController
public class Controller {
	
	
	@Autowired
	public StudentService service;
	
	@PostMapping("/addStudent")
	public Student add(@RequestBody Student student) {
		return service.addStudent(student);
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(Student student) {
		return service.getAll(student);
		
	}
	 
	@GetMapping("/getstudent/{name}")
	public Student getByName(@PathVariable String name) {
		return service.getByName(name);
	}
}
