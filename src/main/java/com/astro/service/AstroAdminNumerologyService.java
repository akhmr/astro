package com.astro.service;

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
		
		AstroNum astroNum = new AstroNum.Builder()
	            .setNumber(request.number())
	            .setNumType(request.numberType().name())
	            .setCategory(request.category())
	            .setDisplayName(request.displayName())
	            .setPosTrait(request.posTrait())
	            .setNegTrait(request.negTrait())
	            .setRemedy(request.remedy())
	            .build();
	    
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
