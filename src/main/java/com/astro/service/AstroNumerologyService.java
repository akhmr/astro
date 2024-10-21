package com.astro.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.common.constant.AstroConstant;
import com.astro.common.eum.AstroNumType;
import com.astro.common.utils.DateUtil;
import com.astro.common.utils.NumerologyUtils;
import com.astro.entity.AstroNum;
import com.astro.entity.repo.AstroNumRepo;
import com.astro.model.AstroNumDto;
import com.astro.model.AstroNumSubcategory;
import com.astro.model.NumerologyRequest;
import com.astro.model.NumerologyResponse;

@Service
public class AstroNumerologyService {
	
	private static final Logger logger = LoggerFactory.getLogger(AstroNumerologyService.class);

	
	@Autowired
	private AstroNumRepo  astroNumRepo;
	
	
	@Autowired
	private NumerologyNumCalculatorSerivce numerologyNumCalculatorSerivce;

	public NumerologyResponse numerologyRequest(NumerologyRequest request) {
        List<AstroNumDto> astroNumDtos = AstroConstant.parentCategories.stream()
            .map(astroNumType -> getAstroNumDetail(
            		numerologyNumCalculatorSerivce.calculateNumerologyNumber(astroNumType, request), astroNumType))
            .collect(Collectors.toList());

        return new NumerologyResponse(astroNumDtos);
    }


    private AstroNumDto getAstroNumDetail(Integer astroNumber, AstroNumType astroNumType) {
        List<AstroNum> astroNums = Optional.ofNullable(
						                astroNumRepo.findByNumberAndNumTypeAndCategories(astroNumber,astroNumType.name(), AstroConstant.subCategories))
        								.orElseThrow(
						                () -> new RuntimeException("Number does not exist for type: " + astroNumType)
        								);

        if (astroNums.isEmpty()) {
        	return null;
          //  throw new RuntimeException("Number does not exist for type: " + astroNumType);
        }
        logger.info("AstroNums {}",astroNums);
        AstroNum astroNumEntity = astroNums.get(0);
        return new AstroNumDto(
            astroNumEntity.getNumber(),
            astroNumEntity.getNumType(),
            astroNumEntity.getDisplayName(),
            getAstroNumSubcategories(astroNums)
        );
    }
	
	private List<AstroNumSubcategory> getAstroNumSubcategories(List<AstroNum> astroNums) {
        return Optional.ofNullable(astroNums)
            .orElse(Collections.emptyList())
            .stream()
            .map(astroNum -> new AstroNumSubcategory(
                astroNum.getDisplayName(),
                astroNum.getPosTrait(),
                astroNum.getNegTrait(),
                astroNum.getRemedy()))
            .collect(Collectors.toList());
    }
}
