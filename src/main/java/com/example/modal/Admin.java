package com.example.modal;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_table")
public class Admin 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="adm_id")
    private int adminId;
	@Column(name="adm_pass",nullable=false,length = 50)
    private String password;
	@Column(name="adm_email",nullable=false,unique = true,length = 30)
    private String email;
	
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + ", email=" + email + "]";
	}
	
	
}
