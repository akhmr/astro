package com.astro.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.entity.AstroNum;
import com.astro.entity.AstroNumRelation;
import com.astro.entity.repo.AstroNumRelationRepo;
import com.astro.entity.repo.AstroNumRepo;
import com.astro.model.AstroNumRelAdminRequest;
import com.astro.model.CreateOrUpdateAstroNumAdminRequest;

import jakarta.transaction.Transactional;

@Service
public class AstroAdminNumerologyService {
	
	
	@Autowired
	private AstroNumRepo  astroNumRepo;
	
	@Autowired
	private AstroNumRelationRepo astroNumRelationRepo;
	

	@Transactional
	public String createOrUpdateNumerologyNumRequest(CreateOrUpdateAstroNumAdminRequest request) {
		
		AstroNum astroNum = new AstroNum();
		astroNum.setNumber(request.getNumber());
		astroNum.setNumType(request.getNumberType().name());
		astroNum.setCategory(request.getCategory());
		astroNum.setNum_desc(request.getNumDesc());
		
		astroNumRepo.save(astroNum);
		
		return "";
	}

	@Transactional
	public String createOrUpdateastroNumRelAdminRequest(AstroNumRelAdminRequest request) {
		
		AstroNumRelation astroNumRelation = new AstroNumRelation();
		astroNumRelation.setFromNum(request.getFromNum());
		astroNumRelation.setFromNumType(request.getFromNumType());
		astroNumRelation.setToNum(request.getToNum());
		astroNumRelation.setToNumType(request.getToNumType());
		astroNumRelation.setRelDesc(request.getRelDesc());
		astroNumRelationRepo.save(astroNumRelation);
		return "";
	}
	
	
	

}
