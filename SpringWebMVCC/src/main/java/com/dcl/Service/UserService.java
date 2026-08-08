package com.dcl.Service;

import java.util.List;

import com.dcl.Entity.User;

public interface UserService {

    User addUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(Integer userId);
	
	User getUserById(Integer userId);
	
	List<User> getAllUser();
	
	
}

