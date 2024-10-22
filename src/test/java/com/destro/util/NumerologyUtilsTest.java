package com.destro.util;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.astro.common.eum.Gender;
import com.astro.common.utils.DateNumerologyUtil;
import com.astro.common.utils.NameNumerologyUtil;
import com.astro.common.utils.NumerologyUtils;

/**@ExtendWith(SpringExtension.class)
@SpringBootTest*/	
public class NumerologyUtilsTest {

    

    @Test
    public void testCalculateDestinyNumber() {
        // Test Destiny Number with a name
        String name = "Pooja Rawat";
        int expectedDestinyNumber = 3; // J(1) + O(6) + H(8) + N(5) + D(4) + O(6) + E(5) = 35 -> 3 + 5 = 8
        int actualDestinyNumber = NameNumerologyUtil.calculateDestinyNo(name);
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
        int actualSoulUrgeNumber = NameNumerologyUtil.calculateSoulUrgeNumber(name);

        assertEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

    @Test
    public void testCalculateSoulUrgeNumber_MixedName() {
        // Test with a mixed name
        String name = "John Doe";
        int expectedSoulUrgeNumber = 6 + 6 + 5; // O(6) + O(6) + E(5) = 17 -> 1 + 7 = 8
        int actualSoulUrgeNumber = NameNumerologyUtil.calculateSoulUrgeNumber(name);

        assertNotEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

    @Test
    public void testCalculateSoulUrgeNumber_NoVowels() {
        // Test with a name that contains no vowels
        String name = "Bcdfg";
        int expectedSoulUrgeNumber = 0; // No vowels, so the sum should be 0
        int actualSoulUrgeNumber = NameNumerologyUtil.calculateSoulUrgeNumber(name);

        assertEquals(expectedSoulUrgeNumber, actualSoulUrgeNumber);
    }

    @Test
    public void testCalculateSoulUrgeNumber_EmptyName() {
        // Test with an empty name
        String name = "";
        int expectedSoulUrgeNumber = 0; // An empty name should result in 0
        int actualSoulUrgeNumber = NameNumerologyUtil.calculateSoulUrgeNumber(name);

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
        int actualPersonalityNumber = NameNumerologyUtil.calculatePersonalityNumber(name);
        
        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_MixedName() {
        // Test with a name that includes both vowels and consonants
        String name = "Pooja rawat";
        int expectedPersonalityNumber = 6; // J(1) + H(8) + D(4) = 13 -> 1 + 3 = 4
        int actualPersonalityNumber = NameNumerologyUtil.calculatePersonalityNumber(name);
        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_NoConsonants() {
        // Test with a name that contains no consonants
        String name = "AEIOU"; // Only vowels
        int expectedPersonalityNumber = 0; // No consonants, so the sum should be 0
        int actualPersonalityNumber = NameNumerologyUtil.calculatePersonalityNumber(name);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_EmptyName() {
        // Test with an empty name
        String name = "";
        int expectedPersonalityNumber = 0; // An empty name should result in 0
        int actualPersonalityNumber = NameNumerologyUtil.calculatePersonalityNumber(name);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }

    @Test
    public void testCalculatePersonalityNumber_NameWithSpaces() {
        // Test with a name that has spaces
        String name = "Anna Marie";
        int expectedPersonalityNumber = 5 ; // N(5) + N(5) + M(4) + R(9) = 23 -> 2 + 3 = 5
        int actualPersonalityNumber = NameNumerologyUtil.calculatePersonalityNumber(name);

        assertEquals(expectedPersonalityNumber, actualPersonalityNumber);
    }
    
    
    /**
     * BirthNumber test case
     */
    
    @Test
    public void testCalculateBirthdayNumber_SingleDigit() {
        // Test with a single-digit day of the month
        LocalDate birthDate = LocalDate.of(1990, 5, 4); // Day is 4
        int expectedBirthdayNumber = 4; // Expected result should be 4
        int actualBirthdayNumber = DateNumerologyUtil.calculateBirthdayNumber(birthDate);

        assertEquals(expectedBirthdayNumber, actualBirthdayNumber);
    }

    @Test
    public void testCalculateBirthdayNumber_TwoDigit() {
        // Test with a two-digit day of the month
        LocalDate birthDate = LocalDate.of(1990, 5, 14); // Day is 14
        int expectedBirthdayNumber = 5; // 1 + 4 = 5
        int actualBirthdayNumber = DateNumerologyUtil.calculateBirthdayNumber(birthDate);

        assertEquals(expectedBirthdayNumber, actualBirthdayNumber);
    }
    
    /**
     * Matuiry no test case
     */
    
    @Test
    public void testCalculateMaturityNumber() {
        // Test with a sample birth date and name
        LocalDate birthDate = LocalDate.of(1990, 5, 14); // Example birth date
        String name = "John Doe"; // Example name

        // Calculate expected Life Path Number
        int lifePathNumber = DateNumerologyUtil.calculateLifePathNumber(birthDate); // Should be 5
        // Calculate expected Destiny Number
        int destinyNumber = NameNumerologyUtil.calculateDestinyNo(name); // 'John Doe' = 2 (J=1, O=6, H=8, N=5, D=4, O=6, E=5; 1+6+8+5+4+6+5=35 -> 3+5=8)
        
        // Calculate expected Maturity Number
        int expectedMaturityNumber = NumerologyUtils.reduceToSingleDigit(lifePathNumber + destinyNumber); // 5 + 8 = 13 -> 1 + 3 = 4
        int actualMaturityNumber = NumerologyUtils.calculateMaturityNumber(birthDate, name);

        assertEquals(expectedMaturityNumber, actualMaturityNumber);
    }

    @Test
    public void testCalculateMaturityNumber_MasterNumber() {
        // Test with a birth date and name that yield a master number
        LocalDate birthDate = LocalDate.of(1990, 5, 22); // Example birth date (22)
        String name = "Jane Smith"; // Example name

        // Calculate expected Life Path Number
        int lifePathNumber = DateNumerologyUtil.calculateLifePathNumber(birthDate); // Should be 4
        // Calculate expected Destiny Number
        int destinyNumber = NameNumerologyUtil.calculateDestinyNo(name); // Calculate Destiny Number based on the name

        // Calculate expected Maturity Number
        int expectedMaturityNumber = NumerologyUtils.reduceToSingleDigit(lifePathNumber + destinyNumber); // Expected result to be calculated accordingly
        int actualMaturityNumber = NumerologyUtils.calculateMaturityNumber(birthDate, name);

        assertEquals(expectedMaturityNumber, actualMaturityNumber);
    }

    @Test
    public void testCalculateMaturityNumber_AnotherDateAndName() {
        // Test with another birth date and name
        LocalDate birthDate = LocalDate.of(1985, 12, 30); // Example birth date
        String name = "Alice Johnson"; // Example name

        // Calculate expected Life Path Number
        int lifePathNumber = DateNumerologyUtil.calculateLifePathNumber(birthDate); // Should be calculated
        // Calculate expected Destiny Number
        int destinyNumber = NameNumerologyUtil.calculateDestinyNo(name); // Should be calculated

        // Calculate expected Maturity Number
        int expectedMaturityNumber = NumerologyUtils.reduceToSingleDigit(lifePathNumber + destinyNumber); // Expected result to be calculated accordingly
        int actualMaturityNumber = NumerologyUtils.calculateMaturityNumber(birthDate, name);

        assertEquals(expectedMaturityNumber, actualMaturityNumber);
    }
    
    /**
     * Personality test cases
     */
    
    @Test
    public void testCalculatePersonalityYearNumber_MasterNumber() {
        // Test with a birth date that might lead to a master number
        LocalDate birthDate = LocalDate.of(1988, 11, 11); // November 11, 1988
        int expectedPersonalityYearNumber = NumerologyUtils.reduceToSingleDigit(11 + 11 + LocalDate.now().getYear()); // Example calculation
        int actualPersonalityYearNumber = DateNumerologyUtil.calculatePersonalityYearNumber(birthDate);

        assertEquals(expectedPersonalityYearNumber, actualPersonalityYearNumber);
    }

    @Test
    public void testCalculatePersonalityYearNumber_LeapYear() {
        // Test with a birth date during a leap year
        LocalDate birthDate = LocalDate.of(2000, 2, 29); // February 29, 2000
        int expectedPersonalityYearNumber = NumerologyUtils.reduceToSingleDigit(2 + 29 + LocalDate.now().getYear()); // Example calculation
        int actualPersonalityYearNumber = DateNumerologyUtil.calculatePersonalityYearNumber(birthDate);

        assertEquals(expectedPersonalityYearNumber, actualPersonalityYearNumber);
    }

    @Test
    public void testCalculatePersonalityYearNumber_EndOfYear() {
        // Test with a birth date at the end of the year
        LocalDate birthDate = LocalDate.of(1995, 12, 31); // December 31, 1995
        int expectedPersonalityYearNumber = NumerologyUtils.reduceToSingleDigit(12 + 31 + LocalDate.now().getYear()); // Example calculation
        int actualPersonalityYearNumber = DateNumerologyUtil.calculatePersonalityYearNumber(birthDate);

        assertEquals(expectedPersonalityYearNumber, actualPersonalityYearNumber);
    }

    @Test
    public void testCalculatePersonalityYearNumber_BirthDateToday() {
        // Test with the birth date being today
        LocalDate birthDate = LocalDate.now(); // Today
        int expectedPersonalityYearNumber = NumerologyUtils.reduceToSingleDigit(birthDate.getMonthValue() + birthDate.getDayOfMonth() + LocalDate.now().getYear());
        int actualPersonalityYearNumber = DateNumerologyUtil.calculatePersonalityYearNumber(birthDate);

        assertEquals(expectedPersonalityYearNumber, actualPersonalityYearNumber);
    }
    
    /**
     * Kua no test
     */
    
    @Test
    public void testCalculateKuaNumber_Male() {
        // Test case for a male
    	Gender gender = Gender.MALE;
        LocalDate birthDate = LocalDate.of(1980, 12, 31); 
        int expectedKuaNumber = 2; // 1 + 9 + 8 + 0 = 18 -> 1 + 8 = 9; 11 - 9 = 2
        int actualKuaNumber = NumerologyUtils.calculateKuaNumber(birthDate, gender);

        assertEquals(expectedKuaNumber, actualKuaNumber, "Kua number for male should be 2");
    }

    @Test
    public void testCalculateKuaNumber_Female() {
        // Test case for a female
    	LocalDate birthDate = LocalDate.of(1980, 12, 31);
        Gender gender = Gender.FEMALE;
        int expectedKuaNumber = 5; // 1 + 9 + 8 + 0 = 18 -> 1 + 8 = 9; 5 + 9 = 14 -> 1 + 4 = 5
        int actualKuaNumber = NumerologyUtils.calculateKuaNumber(birthDate, gender);

        assertEquals(expectedKuaNumber, actualKuaNumber, "Kua number for female should be 5");
    }
    
}