package com.oms.service;

import java.util.List;

import com.oms.entity.Admin;
import com.oms.exception.NullEmailFoundException;
import com.oms.exception.NullUserFound;

public interface AdminService {

	public Admin registerAdmin(Admin admin) throws NullUserFound, NullEmailFoundException;

	public List<Admin> getAllAdmins();

	public Admin getAdminById(Integer pid) throws NullUserFound;

	public Admin updateAdmin(Admin admin) throws NullUserFound;

	public String deleteAdmin(Admin admin) throws NullUserFound;

	public Admin loginAdmin(String email, String password) throws NullUserFound;
}