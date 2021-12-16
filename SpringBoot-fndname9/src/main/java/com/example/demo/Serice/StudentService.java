package com.example.demo.Serice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.studentRepository;

@Service
public class StudentService {

	
	@Autowired
	private studentRepository repository;
	
	
	
	public Student addStudent(Student student) {
		return repository.save(student);
		
	
	}
	
	
	public List<Student> getAll(Student student){
		return   repository.findAll();
	}
	

    public Student getByName(String name) {
    	return repository.findByName(name);
    	
    }

}
