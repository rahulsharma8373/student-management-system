package com.rahul.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
