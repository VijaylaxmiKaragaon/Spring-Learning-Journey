package com.dcl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.Entity.User;
import com.dcl.Service.UserService;
import com.dcl.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo urepo;
	
	@Override
	public User addUser(User user) {
		return urepo.save(user);
	}

	@Override
	public void updateUser(User user) {
		urepo.save(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		urepo.deleteById(userId);
	}

	@Override
	public User getUserById(Integer userId) {
		return urepo.findById(userId).orElse(null);
	}

	@Override
	public List<User> getAllUser() {
		return urepo.findAll();
	}



}