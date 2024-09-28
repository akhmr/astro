package com.astro.admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.admin.service.AstroAdminNumerologyService;
import com.astro.common.Response;
import com.astro.request.CreateOrUpdateAstroNumAdminRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/admin")
public class AstroAdminController {
	
    
	private static final Logger logger = LoggerFactory.getLogger(AstroAdminController.class);


	@Autowired
	private AstroAdminNumerologyService adminNumerologyService;
	
	@PostMapping("/v1/numerology/num")
	   public Response<String> createOrUpdateNumerologyNumRequest(@RequestBody CreateOrUpdateAstroNumAdminRequest request) {
		   
		
		return new Response<String>("000","success",adminNumerologyService.createOrUpdateNumerologyNumRequest(request));
		}

	
	


}
