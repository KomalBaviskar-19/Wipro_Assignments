package com.komal.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.komal.demo.entites.User;
import com.komal.demo.ex.USER_NOT_FOUND_EXCEPTON;
import com.komal.demo.repository.UserRepository;

@Service
public class UserSeviceImp implements UserService {
	 
	@Autowired
	private UserRepository userRepository;
	
	
	

	@Override
	public User save(User user) {
	
		return userRepository.save(user);
		
	}
	
	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}
	
	@Override
	public Page<User> findAllUserPage(Pageable pageable) {
		return userRepository.findAll(pageable);
	}
	
	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
	
	@Override
	public User updateUserById(Long id, User user) {
		
		User existedUser=userRepository.findById(id).
				orElseThrow(()->new USER_NOT_FOUND_EXCEPTON("User with that id Not Present!"+id));
	
		                      //name=ram123
		existedUser.setName(user.getName());
		existedUser.setEmail(user.getEmail());
		return userRepository.save(existedUser);
	}
	
	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public User patchUpdateUserById(Long id, User user) {
		
		User existedUser=userRepository.findById(id).
				orElseThrow(()->new RuntimeException("User with that id Not Present!"+id));
	
		      if(user.getName()!=null)     
		      {
		    	  existedUser.setName(user.getName());
		      }
		      if(user.getEmail()!=null)
		      {
		    	  existedUser.setEmail(user.getEmail());
		      }
		
		return userRepository.save(existedUser);
	}
	
	@Override 
	public List<User> getUserByName(String name)
    {
    	 return  userRepository.getUserByName(name);
    }
    
	
	
}
