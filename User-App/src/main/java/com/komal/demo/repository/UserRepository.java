package com.komal.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.komal.demo.entites.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	List<User> getUserByName(String name);

	
 
	
}  


 
 