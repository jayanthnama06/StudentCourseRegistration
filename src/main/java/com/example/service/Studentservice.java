package com.example.service;


import java.util.List;
import java.util.Optional;

import com.example.modal.Student;


public interface Studentservice {
	
	

public String addstudent(Student std);
public Student Stdlogin(String email , String pwd) ;
public List<Student> getAll();
public  Optional<Student> findStudentById(Integer studentId);


}
