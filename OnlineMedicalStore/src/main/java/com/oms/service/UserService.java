package com.oms.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.oms.entity.User;
@Service
public interface UserService {
 
	public User addUser(User user) throws Exception;
	public List<User> getAllUSer() throws Exception;
	public  void  delete(int  id);
	//public List<User> sortUserByName() throws Exception;
	public User getUserByUserName(String userName) throws Exception;
	public User getUserByRole(String role) throws Exception;
	public User getUserByUserId(int userId) throws Exception;
	public List<User> getUsersBetweenIds(int range1,int range2)throws Exception;

 
}

