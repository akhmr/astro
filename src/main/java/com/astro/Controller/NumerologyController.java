package com.astro.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.common.Response;
import com.astro.common.constant.StatusCode;
import com.astro.model.NumerologyRequest;
import com.astro.model.NumerologyResponse;
import com.astro.service.AstroNumerologyService;

@RestController
@RequestMapping("/api/astro/")
public class NumerologyController {
	
	private static final Logger logger = LoggerFactory.getLogger(NumerologyController.class);

	@Autowired
	private AstroNumerologyService numerologyService;
	
	@PostMapping("num/v1")
	public Response<NumerologyResponse> numerologyRequest(@RequestBody NumerologyRequest request) {

		logger.info("NumerologyRequest {} ", request);
		
		
		return new Response<NumerologyResponse>(StatusCode.SUCCESS.name(), StatusCode.SUCCESS.getMessage(),
				numerologyService.numerologyRequest(request));
	
	}
	
	
	
	

}
