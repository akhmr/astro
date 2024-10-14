package com.astro.common.utils;

import java.time.LocalDate;

public class NumerologyUtils {

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

	public static int calculateDriverNo() {
		return 2;
	}
	
	public static int calculateSoulNo() {
		return 3;
	}
	
	public static int calculateKuaNo() {
		return 4;
	}

	private static int reduceToSingleDigit(int num) {
		while (num > 9) {
			num = sumOfDigits(num);
		}
		return num;
	}

	private static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
