package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.modal.Employee;
import com.example.repository.EmployeeRepository;


@Service
public class EmployeeServiceImple implements Employeeservice {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String addcustomer(Employee emp) {
		employeeRepository.save(emp);
		return "added sucessfully";
	}

	@Override
	public Employee Emplogin(String email, String pwd) {
		return employeeRepository.Emplogin(email, pwd);
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public String sendEmail(String fromemail, String toemail, String subject, String text) {
		// TODO Auto-generated method stub
		return null;
	}

}
