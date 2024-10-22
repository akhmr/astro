package com.astro.common.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.astro.common.eum.Gender;

public class NumerologyUtils {
	
	 static final Map<Character, Integer> numerologyMap = new HashMap<>();
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
	
	
		public static int calculateMaturityNumber(LocalDate birthDate, String name) {
			int lifePathNumber = DateNumerologyUtil.calculateLifePathNumber(birthDate);
			int destinyNumber = NameNumerologyUtil.calculateDestinyNo(name);
			return reduceToSingleDigit(lifePathNumber + destinyNumber);
		}

		public static int calculateKuaNumber(LocalDate localDate, Gender gender) {
			
			int birthYear = localDate.getYear();
			int singleDigit = reduceToSingleDigit(birthYear);
			
			if (gender.equals(Gender.MALE)) {
				return reduceToSingleDigit(11 - singleDigit);// For males
			} else {
				return reduceToSingleDigit(5 + singleDigit);
			}
		}

		static boolean isVowel(char ch) {
			return VOWELS.indexOf(ch) != -1;
		}

		public static int reduceToSingleDigit(int num) {
			while (num > 9 /** && num != 11 && num != 22 && num != 33 */
			) {
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
