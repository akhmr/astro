package com.astro.admin.Controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.astro.common.utils.DateNumerologyUtil;
import com.astro.common.utils.DateUtil;
import com.astro.common.utils.NumerologyUtils;

@RestController
@RequestMapping("/api/admin")
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(AstroAdminController.class);

	@GetMapping("/test/lnp")
	public Integer getLNP(@RequestParam String  dateString) {
		
		logger.info("LNP date {} ",dateString);

		LocalDate localDate = DateUtil.parseDateToLocalDate(dateString);
		int day = localDate.getDayOfMonth();
		int month = localDate.getMonthValue();
		int year = localDate.getYear();

		return DateNumerologyUtil.calculateLifePathNumber(day, month, year);

	}

}
