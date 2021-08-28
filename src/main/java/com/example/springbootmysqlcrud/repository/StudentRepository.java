package com.example.springbootmysqlcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootmysqlcrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
