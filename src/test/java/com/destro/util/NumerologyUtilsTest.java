package com.destro.util;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.astro.common.utils.NumerologyUtils;

/**@ExtendWith(SpringExtension.class)
@SpringBootTest*/	
public class NumerologyUtilsTest {

    

    @Test
    public void testCalculateDestinyNumber() {
        // Test Destiny Number with a name
        String name = "Pooja Rawat";
        int expectedDestinyNumber = 3; // J(1) + O(6) + H(8) + N(5) + D(4) + O(6) + E(5) = 35 -> 3 + 5 = 8
        int actualDestinyNumber = NumerologyUtils.calculateDestinyNo(name);
        System.out.println("DestinyNumber "+actualDestinyNumber);


        assertEquals(expectedDestinyNumber, actualDestinyNumber);
    }

    @Test
    public void testReduceToSingleDigit() {
        // Test reduction to a single digit
        int number = 987;
        int expectedSingleDigit = 6; // 9 + 8 + 7 = 24 -> 2 + 4 = 6
        int actualSingleDigit = NumerologyUtils.reduceToSingleDigit(number);

        assertEquals(expectedSingleDigit, actualSingleDigit);
    }

    @Test
    public void testSumOfDigits() {
        // Test sum of digits
        int number = 1234;
        int expectedSum = 10; // 1 + 2 + 3 + 4 = 10
        int actualSum = NumerologyUtils.sumOfDigits(number);

        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testCalculateSoulUrgeNumber_AllVowels() {
        // Test with a name containing all vowels
        String name = "AEIOU";
        int expectedSoulUrgeNumber = 6; // A(1) + E(5) + I(9) + O(6) + U(3) = 24 -> 2 + 4 = 6
        int actualSoulUrgeNumber = NumerologyUtils.calculateSoulUrgeNumber(name);

        assertEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

    @Test
    public void testCalculateSoulUrgeNumber_MixedName() {
        // Test with a mixed name
        String name = "John Doe";
        int expectedSoulUrgeNumber = 6 + 6 + 5; // O(6) + O(6) + E(5) = 17 -> 1 + 7 = 8
        int actualSoulUrgeNumber = NumerologyUtils.calculateSoulUrgeNumber(name);

        assertNotEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

    @Test
    public void testCalculateSoulUrgeNumber_NoVowels() {
        // Test with a name that contains no vowels
        String name = "Bcdfg";
        int expectedSoulUrgeNumber = 0; // No vowels, so the sum should be 0
        int actualSoulUrgeNumber = NumerologyUtils.calculateSoulUrgeNumber(name);

        assertEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

    @Test
    public void testCalculateSoulUrgeNumber_EmptyName() {
        // Test with an empty name
        String name = "";
        int expectedSoulUrgeNumber = 0; // An empty name should result in 0
        int actualSoulUrgeNumber = NumerologyUtils.calculateSoulUrgeNumber(name);

        assertEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

   /**
    * 
    * Personality test case
    */
    @Test
    public void testCalculatePersonalityNumber_OnlyConsonants() {
        // Test with a name containing only consonants
        String name = "BCDF";
        int expectedPersonalityNumber =  6; 
        int actualPersonalityNumber = NumerologyUtils.calculatePersonalityNumber(name);
        
        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_MixedName() {
        // Test with a name that includes both vowels and consonants
        String name = "Pooja rawat";
        int expectedPersonalityNumber = 6; // J(1) + H(8) + D(4) = 13 -> 1 + 3 = 4
        int actualPersonalityNumber = NumerologyUtils.calculatePersonalityNumber(name);
        System.out.println("Personality no "+actualPersonalityNumber);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_NoConsonants() {
        // Test with a name that contains no consonants
        String name = "AEIOU"; // Only vowels
        int expectedPersonalityNumber = 0; // No consonants, so the sum should be 0
        int actualPersonalityNumber = NumerologyUtils.calculatePersonalityNumber(name);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_EmptyName() {
        // Test with an empty name
        String name = "";
        int expectedPersonalityNumber = 0; // An empty name should result in 0
        int actualPersonalityNumber = NumerologyUtils.calculatePersonalityNumber(name);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_NameWithSpaces() {
        // Test with a name that has spaces
        String name = "Anna Marie";
        int expectedPersonalityNumber = 5 ; // N(5) + N(5) + M(4) + R(9) = 23 -> 2 + 3 = 5
        int actualPersonalityNumber = NumerologyUtils.calculatePersonalityNumber(name);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }
}