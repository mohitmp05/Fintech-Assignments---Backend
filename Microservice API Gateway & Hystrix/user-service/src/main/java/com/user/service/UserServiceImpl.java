package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list = List.of(
			new User (101L, "Mohit","98975465"),
			new User (102L, "Aakash","88535165"),
			new User (103L, "Sumit","69975465")
			);

	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);

	}
}
