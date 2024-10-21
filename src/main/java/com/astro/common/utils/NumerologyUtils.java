package com.astro.common.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class NumerologyUtils {
	
	 private static final Map<Character, Integer> numerologyMap = new HashMap<>();
	 private static final String VOWELS = "AEIOU"; // Static string variable for vowels


	    static {
	        // Initialize the numerology map
	        numerologyMap.put('A', 1); numerologyMap.put('J', 1); numerologyMap.put('S', 1);
	        numerologyMap.put('B', 2); numerologyMap.put('K', 2); numerologyMap.put('T', 2);
	        numerologyMap.put('C', 3); numerologyMap.put('L', 3); numerologyMap.put('U', 3);
	        numerologyMap.put('D', 4); numerologyMap.put('M', 4); numerologyMap.put('V', 4);
	        numerologyMap.put('E', 5); numerologyMap.put('N', 5); numerologyMap.put('W', 5);
	        numerologyMap.put('F', 6); numerologyMap.put('O', 6); numerologyMap.put('X', 6);
	        numerologyMap.put('G', 7); numerologyMap.put('P', 7); numerologyMap.put('Y', 7);
	        numerologyMap.put('H', 8); numerologyMap.put('Q', 8); numerologyMap.put('Z', 8);
	        numerologyMap.put('I', 9); numerologyMap.put('R', 9);
	    }


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
	
	
	public static int calculateDestinyNo(String name) {
		
		int sum = name.toUpperCase().chars() 
	            .filter(Character::isLetter) 
	            .map(ch -> numerologyMap.getOrDefault((char) ch, 0))
	            .sum(); 
		
		System.out.println("Sum "+sum);

		return reduceToSingleDigit(sum);
	}
	
	public static int calculateSoulUrgeNumber(String name) {
        int sum = name.toUpperCase().chars()
                .filter(ch -> isVowel((char) ch))
                .map(ch -> numerologyMap.getOrDefault((char) ch, 0))
                .sum(); //
        return reduceToSingleDigit(sum);
    }
	
	public static int calculatePersonalityNumber(String name) {
        int sum = name.toUpperCase().chars()
                .filter(ch -> !isVowel((char) ch) && Character.isLetter(ch)) 
                .map(ch -> numerologyMap.getOrDefault((char) ch, 0)) 
                .sum(); // Sum the values

        // Reduce the sum to a single digit or master number (11, 22, 33)
        return reduceToSingleDigit(sum);
    }


	private static boolean isVowel(char ch) {
		return VOWELS.indexOf(ch) != -1;
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

	public static int reduceToSingleDigit(int num) {
		while (num > 9  /**&& num != 11 && num != 22 && num != 33*/) {
			num = sumOfDigits(num);
		}
		return num;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	
}
