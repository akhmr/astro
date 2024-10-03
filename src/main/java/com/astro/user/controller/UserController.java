package com.astro.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.common.Response;
import com.astro.model.UserSignUpRequest;
import com.astro.user.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/v1/signup")
   public Response<String> signUp(@RequestBody UserSignUpRequest userSignUpRequest) {
	   return new Response<String>("000","success",userService.signUp(userSignUpRequest));
	}



}
