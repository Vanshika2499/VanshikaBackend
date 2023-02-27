package com.oms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.oms.entity.Admin;
//import com.oms.entity.Tutor;
import com.oms.exception.NullEmailFoundException;
import com.oms.exception.NullUserFound;
import com.oms.repository.AdminRepository;
//import com.oms.repository.TutorRepository;
import com.oms.service.AdminService;
//import com.oms.service.TutorService;

@SpringBootTest
class AdminTest {

	@Autowired
	AdminRepository adminRepo;

	@Autowired
	AdminService adminService;

	@Test
	void getAdminById() throws NullUserFound {

		assertThrows(NullUserFound.class, () -> adminService.getAdminById(0));

	}

	@Test
	void updateAdmin() throws NullUserFound {
		Admin a = new Admin(000, "Test", "User", "", "pass@123");

		assertThrows(NullUserFound.class, () -> adminService.updateAdmin(a));

	}

	@Test
	void deleteAdmin() throws NullUserFound {
		Admin a = new Admin(001, "Test", "User", "", "pass@123");

		assertThrows(NullUserFound.class, () -> adminService.deleteAdmin(a));

	}

}