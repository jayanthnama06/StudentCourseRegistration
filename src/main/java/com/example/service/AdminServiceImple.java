package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modal.Admin;
import com.example.repository.AdminRepository;



@Service
public class AdminServiceImple implements Adminservice
{
	@Autowired
	private AdminRepository adminRepository;
	
	

	@Override
	public Admin Admlogin(String email, String pwd) {
		return adminRepository.Admlogin(email, pwd);
		
	}

	@Override
	public List<Admin> getAll() 
	{
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
}
