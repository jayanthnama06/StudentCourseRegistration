package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modal.Student;
import com.example.repository.StudentRepository;


@Service
public class StudentServiceImple implements Studentservice {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public String addstudent(Student std) {
		studentRepository.save(std);
		return "added sucessfully";
	}

	@Override
	public Student Stdlogin(String email, String pwd) {
		return studentRepository.Stdlogin(email, pwd);
		
	}

	@Override
	public List<Student> getAll() {
		
		return studentRepository.findAll();
	}
	
	@Override
	public Optional<Student> findStudentById(Integer studentId) {
        return studentRepository.findById(studentId);
    }

	

}
