package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.modal.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select c from Student c where c.email=?1 and c.password=?2")
	public Student Stdlogin(String email , String pwd) ;
	
}
