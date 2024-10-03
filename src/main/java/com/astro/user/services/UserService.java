package com.astro.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.model.UserSignUpRequest;
import com.astro.user.entity.User;
import com.astro.user.entity.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public String signUp(UserSignUpRequest userSignUpRequest) {
		
		User  user = new User();
		
		user.setEmail(userSignUpRequest.getEmail());
		user.setPhoneNo(user.getPhoneNo());
		user.setFirstname(userSignUpRequest.getFirstname());
		userRepo.save(user);
		return "ok";
		
	}
	

}
