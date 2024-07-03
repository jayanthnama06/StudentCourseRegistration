package com.example.modal;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "student_table")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="std_id")
    private int studentId;
    @Column(name="std_fisrtname",nullable=false,length = 50)
    private String firstName;
    @Column(name="std_lastname",nullable=false,length = 50)
    private String lastName;
    @Column(name="std_email",nullable=false,unique = true,length = 30)
    private String email;
    @Column(name="std_department",nullable=false,length = 50)
    private String department;
    @Column(name="std_gender",nullable=false,length = 50)
    private String gender;
    @Column(name="std_contactNumber",nullable=false,length = 50)
    private String contactNumber;
    @Column(name="std_password",nullable=false,length = 50)
    private String password;
    @Column(name="std_confirmPassword",nullable=false,length = 50)
    private String confirmPassword;
    @Column(name="std_joiningDate",nullable=false,length = 50)
    private String joiningDate;
    
    
    @Transient
    private String captcha;
    @Transient
    private String hiddenCaptcha;
    @Transient
    private String realCaptcha;
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	public String getHiddenCaptcha() {
		return hiddenCaptcha;
	}
	public void setHiddenCaptcha(String hiddenCaptcha) {
		this.hiddenCaptcha = hiddenCaptcha;
	}
	public String getRealCaptcha() {
		return realCaptcha;
	}
	public void setRealCaptcha(String realCaptcha) {
		this.realCaptcha = realCaptcha;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", department=" + department + ", gender=" + gender + ", contactNumber=" + contactNumber
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", joiningDate=" + joiningDate
				+ ", captcha=" + captcha + ", hiddenCaptcha=" + hiddenCaptcha + ", realCaptcha=" + realCaptcha + "]";
	}
	
	
	
    
    
	
}
