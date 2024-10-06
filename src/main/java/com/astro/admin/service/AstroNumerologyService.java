package com.astro.admin.service;

import java.time.LocalDate;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.common.eum.AstroNumType;
import com.astro.common.utils.DateUtil;
import com.astro.common.utils.NumerologyUtils;
import com.astro.entity.AstroNum;
import com.astro.entity.repo.AstroNumRepo;
import com.astro.model.NumerologyRequest;
import com.astro.model.NumerologyResponse;

@Service
public class AstroNumerologyService {
	
	private static final Logger logger = LoggerFactory.getLogger(AstroNumerologyService.class);

	
	@Autowired
	private AstroNumRepo  astroNumRepo;

	public NumerologyResponse numerologyRequest(NumerologyRequest request) {
		
		NumerologyResponse  response  = new NumerologyResponse();
		
		LocalDate localDate = DateUtil.parseDateToLocalDate(request.getDob());
		int day = localDate.getDayOfMonth();
		int month = localDate.getMonthValue();
		int year = localDate.getYear();
	    Integer lnpNum= NumerologyUtils.calculateLifePathNumber(day, month, year);
	    
	    logger.info("Life Path Num {} ",lnpNum);
	 // Fetch AstroNum and handle if null using Optional
	    AstroNum astroNum = Optional.ofNullable(astroNumRepo.findbyNumberAndCategory(lnpNum, "lnp_generic"))
	                                .orElseThrow(() -> new RuntimeException("Number does not exist"));

	    response.getAstroMap().put(AstroNumType.LNP.name(), astroNum.getNum_desc());
	    return response;
	}

}
