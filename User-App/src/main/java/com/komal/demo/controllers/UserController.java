package com.komal.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.komal.demo.entites.User;
import com.komal.demo.services.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController

public class UserController {

    
 
	@Autowired
	private UserService userService;


    @PostMapping("/addNewUser")	
	public User addUser( @Valid @RequestBody User user)
	{
		return userService.save(user);
	}
    
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
    	return userService.getUserById(id);
    }
    
    @GetMapping("/getAllUsers")
    public List<User> getAllUser() {
		return userService.findAllUsers();
    }
    
    
    @GetMapping("/getAllUsersPage")
    public Page<User> getAllUserPage(Pageable pageable)
    {
    	 return  userService.findAllUserPage(pageable);
    }
    
    @DeleteMapping("/deleteUserById/{id}")
    public String deleteUser(@PathVariable Long id) 
    {
    	userService.deleteUserById(id);
    	System.out.println("Deleting the user");
		return "user deleted Successfully";
    }
  
    @PutMapping("/updateUserById/{id}")
    public User updateUserById(@PathVariable Long id,@RequestBody User user) {
    	return userService.updateUserById(id,user);
    }
    
    @PutMapping("/patchUpdateUserById/{id}")
    public User patchUpdateUserById(@PathVariable Long id,@RequestBody User user) {
    	return userService.patchUpdateUserById(id,user);
    }
	// http://localhost:8080/getAllUsersPage?page=0&size=4&sort=name,desc 
	// Rest Api best p
 
    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name)
    {
    	 return  userService.getUserByName(name);
    }
    
    
}
