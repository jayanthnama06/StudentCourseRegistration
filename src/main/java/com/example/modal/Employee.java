package com.example.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int employeeId;
    @Column(name="emp_fisrtname",nullable=false,length = 50)
    private String firstName;
    @Column(name="emp_lastname",nullable=false,length = 50)
    private String lastName;
    @Column(name="emp_email",nullable=false,unique = true,length = 30)
    private String email;
    @Column(name="emp_department",nullable=false,length = 50)
    private String department;
    @Column(name="emp_gender",nullable=false,length = 50)
    private String gender;
    @Column(name="emp_contactNumber",nullable=false,length = 50)
    private String contactNumber;
    @Column(name="emp_status",nullable=false,length = 50)
    private String status;
    @Column(name="emp_address",nullable=false,length = 50)
	private String address;
    @Column(name="emp_city",nullable=false,length = 50)
    private String city;
    @Column(name="emp_password",nullable=false,length = 50)
    private String password;
    @Column(name="emp_confirmPassword",nullable=false,length = 50)
    private String confirmPassword;
    @Column(name="emp_joiningDate",nullable=false,length = 50)
    private String joiningDate;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", department=" + department + ", gender=" + gender + ", contactNumber=" + contactNumber
				+ ", status=" + status + ", address=" + address + ", city=" + city + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", joiningDate=" + joiningDate + "]";
	}
	
    
    
    
    
    
	
}
