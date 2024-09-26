package com.astro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.entity.User;
import com.astro.entity.repo.UserRepo;
import com.astro.request.UserSignUpRequest;

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
