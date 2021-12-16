package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface studentRepository extends JpaRepository<Student,Integer>{

	Student findByName(String name);




}
