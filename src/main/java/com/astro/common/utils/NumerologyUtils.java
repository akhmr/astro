package com.astro.common.utils;

public class NumerologyUtils {

	
	public static int calculateLifePathNumber(int day, int month, int year) {
	    int totalSum = sumOfDigits(day) + sumOfDigits(month) + sumOfDigits(year);
	    return reduceToSingleDigit(totalSum);
	}
	
	public static int calculateDriverNo(String birthDate) {
		return 2;
	}

	private static int reduceToSingleDigit(int num) {
		while (num > 9 ) {
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
