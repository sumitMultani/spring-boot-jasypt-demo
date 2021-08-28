package com.example.springbootmysqlcrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootmysqlcrud.model.Student;
import com.example.springbootmysqlcrud.repository.StudentRepository;
import com.example.springbootmysqlcrud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

}
