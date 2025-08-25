package com.komal.demo.services;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.komal.demo.entites.User;

public interface UserService {
	 
	User save(User user);

	public User getUserById(Long id);
	
	Page<User> findAllUserPage(Pageable pageable);

	void deleteUserById(Long id);

	User updateUserById(Long id, User user);

	List<User> findAllUsers();

	User patchUpdateUserById(Long id, User user);

	List<User> getUserByName(String name);
 
}