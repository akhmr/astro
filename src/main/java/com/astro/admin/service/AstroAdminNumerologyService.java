package com.astro.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.entity.AstroNum;
import com.astro.entity.repo.AstroNumRepo;
import com.astro.request.CreateOrUpdateAstroNumAdminRequest;

@Service
public class AstroAdminNumerologyService {
	
	
	@Autowired
	private AstroNumRepo  astroNumRepo;

	public String createOrUpdateNumerologyNumRequest(CreateOrUpdateAstroNumAdminRequest request) {
		
		AstroNum astroNum = new AstroNum();
		astroNum.setNumber(request.getNumber());
		astroNum.setNumType(request.getNumberType().name());
		astroNum.setCategory(request.getCategory());
		astroNum.setNum_desc(request.getNumDesc());
		
		astroNumRepo.save(astroNum);
		
		return "";
	}
	
	
	

}
