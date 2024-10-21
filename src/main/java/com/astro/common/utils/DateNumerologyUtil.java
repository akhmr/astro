package com.astro.common.utils;

import java.time.LocalDate;

import static com.astro.common.utils.NumerologyUtils.*;

public class DateNumerologyUtil {
	
	public static int calculateLifePathNumber(int day, int month, int year) {
		int totalSum = sumOfDigits(day) + sumOfDigits(month) + sumOfDigits(year);
		return reduceToSingleDigit(totalSum);
	}

	public static int calculateLifePathNumber(LocalDate localDate) {
		int day = localDate.getDayOfMonth();
		int month = localDate.getMonthValue();
		int year = localDate.getYear();
		return calculateLifePathNumber(day, month, year);
	}
	
	public static int calculateBirthdayNumber(LocalDate birthDate) {
        return reduceToSingleDigit(birthDate.getDayOfMonth());
    }
	
	public static int calculatePersonalityYearNumber(LocalDate birthDate) {
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();
        int currentYear = LocalDate.now().getYear();

        // Calculate the Personality Year Number
        int personalityYearNumber = reduceToSingleDigit(month + day + currentYear);
        return personalityYearNumber;
    }

}
