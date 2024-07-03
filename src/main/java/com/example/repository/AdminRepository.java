package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.modal.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	@Query("select c from Admin c where c.email=?1 and c.password=?2")
	public Admin Admlogin(String email , String pwd) ;
}
