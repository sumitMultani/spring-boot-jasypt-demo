package com.example.springbootmysqlcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmysqlcrud.model.Student;
import com.example.springbootmysqlcrud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
