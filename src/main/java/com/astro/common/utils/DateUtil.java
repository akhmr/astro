package com.astro.common.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	
	private final static String DDMMYYYY="dd/MM/yyyy";
	
	public static LocalDate parseDateToLocalDate(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(dateString, formatter);

	}


}
