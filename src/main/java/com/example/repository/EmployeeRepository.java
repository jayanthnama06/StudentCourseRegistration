package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.modal.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select c from Employee c where c.email=?1 and c.password=?2")
	public Employee Emplogin(String email , String pwd) ;
	
}
