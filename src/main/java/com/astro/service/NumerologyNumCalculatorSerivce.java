package com.astro.service;

import org.springframework.stereotype.Service;

import com.astro.common.eum.AstroNumType;
import com.astro.common.utils.DateNumerologyUtil;
import com.astro.common.utils.DateUtil;
import com.astro.common.utils.NameNumerologyUtil;
import com.astro.common.utils.NumerologyUtils;
import com.astro.model.NumerologyRequest;

@Service
public class NumerologyNumCalculatorSerivce {
	
	
	public Integer calculateNumerologyNumber(AstroNumType astroNumType, NumerologyRequest request) {
		
	        return switch (astroNumType) {
	            case LIFE_PATH_NUM -> DateNumerologyUtil.calculateLifePathNumber(DateUtil.parseDateToLocalDate(request.getDob()));
	            case PERSONALITY_NUM -> NameNumerologyUtil.calculatePersonalityNumber(request.getName());
	            case BIRTHDAY_NUM -> DateNumerologyUtil.calculateBirthdayNumber(DateUtil.parseDateToLocalDate(request.getDob()));
	            case MATURITY_NUM -> NumerologyUtils.calculateMaturityNumber(DateUtil.parseDateToLocalDate(request.getDob()),request.getName());
	            case DESTINY_NUM ->NameNumerologyUtil.calculateDestinyNo(request.getName());
	            case SOUL_NUM->NameNumerologyUtil.calculateSoulUrgeNumber(request.getName());
	            case KUA_NUM->NumerologyUtils.calculateKuaNumber(DateUtil.parseDateToLocalDate(request.getDob()), request.getGender());
	            case PERSONALITY_YEAR_NUM->DateNumerologyUtil.calculatePersonalityYearNumber(DateUtil.parseDateToLocalDate(request.getDob()));
	            default -> throw new IllegalArgumentException("Invalid numerology type: " + astroNumType);
	        };
		
	}

}
