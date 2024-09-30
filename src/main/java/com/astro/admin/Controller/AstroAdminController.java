package com.astro.admin.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.admin.service.AstroAdminNumerologyService;
import com.astro.common.Response;
import com.astro.request.AstroNumRelAdminRequest;
import com.astro.request.CreateOrUpdateAstroNumAdminRequest;

@RestController
@RequestMapping("/api/admin")
public class AstroAdminController {

	private static final Logger logger = LoggerFactory.getLogger(AstroAdminController.class);

	@Autowired
	private AstroAdminNumerologyService numerologyService;

	@PostMapping("/v1/numerology/num")
	public Response<String> createOrUpdateNumerologyNumRequest(@RequestBody CreateOrUpdateAstroNumAdminRequest request) {

		logger.info("CreateOrUpdateAstroNumAdminRequest {} ", request);
		return new Response<String>("000", "success",numerologyService.createOrUpdateNumerologyNumRequest(request));
	}
	
	@PostMapping("/v1/numerology/num/rel")
	public Response<String> createOrUpdateastroNumRelAdminRequest(@RequestBody AstroNumRelAdminRequest request) {

		logger.info("createOrUpdateastroNumRelAdminRequest {} ", request);
		return new Response<String>("000", "success",numerologyService.createOrUpdateastroNumRelAdminRequest(request));
	}

	/**
	 * @PostMapping("/v1/numerology/num") public Response<String>
	 * createOrUpdateNumerologyNumRequest1(@Valid @RequestBody
	 * CreateOrUpdateAstroNumAdminRequest request) {
	 * 
	 * // Functional logging and response generation
	 * Function<CreateOrUpdateAstroNumAdminRequest, Response<String>> processRequest
	 * = req -> { logger.info("CreateOrUpdateAstroNumAdminRequest {}", req); String
	 * result = adminNumerologyService.createOrUpdateNumerologyNumRequest(req);
	 * return new Response<>("000", "success", result); };
	 * 
	 * // Validate and process request using Optional and functional style return
	 * Optional.ofNullable(request)
	 * .map(req->adminNumerologyService.createOrUpdateNumerologyNumRequest(req)) .
	 * .orElseGet(() -> new Response<>("001", "failure", "Invalid request")); }
	 */

}
