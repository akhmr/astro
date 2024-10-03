package com.astro.common.utils;

public class NumerologyUtils {

	public static int calculateLifePathNumber(int day, int month, int year) {
		int daySum = sumOfDigits(day);
		int monthSum = sumOfDigits(month);
		int yearSum = sumOfDigits(year);

		int totalSum = daySum + monthSum + yearSum;

		// Reduce to a single digit unless it’s a master number (11, 22, 33)
		return reduceToSingleDigit(totalSum);
	}
	
	public static int calculateDriverNo(String birthDate) {
		return 2;
	}

	private static int reduceToSingleDigit(int num) {
		while (num > 9 /**&& num != 11 && num != 22 && num != 33*/) {
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
