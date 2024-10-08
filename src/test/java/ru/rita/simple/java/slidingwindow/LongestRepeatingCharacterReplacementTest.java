package ru.rita.simple.java.slidingwindow;

import junit.framework.TestCase;

public class LongestRepeatingCharacterReplacementTest extends TestCase {

    public void testCharacterReplacement_whenAReplaceToB_thenExpectFour() {
        LongestRepeatingCharacterReplacement testObject = new LongestRepeatingCharacterReplacement();
        String testDataS = "ABAB";
        int testDataK = 2;
        int expected = 4;
        assertEquals(expected, testObject.characterReplacement(testDataS, testDataK));
    }

    public void testCharacterReplacement_whenAReplaceToBAndKEqualsOne_thenExpectFour() {
        LongestRepeatingCharacterReplacement testObject = new LongestRepeatingCharacterReplacement();
        String testDataS = "AABABBA";
        int testDataK = 1;
        int expected = 4;
        assertEquals(expected, testObject.characterReplacement(testDataS, testDataK));
    }
}