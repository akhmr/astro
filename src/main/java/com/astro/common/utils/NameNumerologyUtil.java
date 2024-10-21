package com.astro.common.utils;

import static com.astro.common.utils.NumerologyUtils.*;

public class NameNumerologyUtil {
	
public static int calculateDestinyNo(String name) {
		
		int sum = name.toUpperCase().chars() 
	            .filter(Character::isLetter) 
	            .map(ch -> numerologyMap.getOrDefault((char) ch, 0))
	            .sum(); 
		
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

        return reduceToSingleDigit(sum);
    }

}
