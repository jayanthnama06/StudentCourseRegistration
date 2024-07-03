package com.example.service;

import java.util.List;

import com.example.modal.Admin;


public interface Adminservice 
{
	
	public Admin Admlogin(String email , String pwd) ;
	public List<Admin> getAll();
}
