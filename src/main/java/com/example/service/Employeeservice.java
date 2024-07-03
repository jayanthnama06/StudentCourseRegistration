package com.example.service;

import java.util.List;


import com.example.modal.Employee;



public interface Employeeservice {
	
	

public String addcustomer(Employee emp);
public Employee Emplogin(String email , String pwd) ;
public List<Employee> getAll();
public String sendEmail(String fromemail,String toemail,String subject,String text);

}
