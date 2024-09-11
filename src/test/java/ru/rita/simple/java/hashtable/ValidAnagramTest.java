package ru.rita.simple.java.hashtable;

import junit.framework.TestCase;

public class ValidAnagramTest extends TestCase {

    public void testIsAnagram_when_notEmpty_and_anagram() {
        ValidAnagram anagramCheckerToTest = new ValidAnagram();
        var s = "anagram";
        var t = "nagaram";
        assertTrue(anagramCheckerToTest.isAnagram(s, t));
    }

    public void testIsAnagram_when_notEmpty_and_notAnagram() {
        ValidAnagram anagramCheckerToTest = new ValidAnagram();
        var s = "rat";
        var t = "car";
        assertFalse(anagramCheckerToTest.isAnagram(s, t));
    }

    public void testIsAnagram_when_bothNull() {
        ValidAnagram anagramCheckerToTest = new ValidAnagram();
        String s = null;
        String t = null;
        assertTrue(anagramCheckerToTest.isAnagram(s, t));
    }

    public void testIsAnagram_when_bothEmpty() {
        ValidAnagram anagramCheckerToTest = new ValidAnagram();
        String s = "";
        String t = "";
        assertTrue(anagramCheckerToTest.isAnagram(s, t));
    }

    public void testIsAnagram_when_oneNull() {
        ValidAnagram anagramCheckerToTest = new ValidAnagram();
        String s = null;
        String t = "null";
        assertFalse(anagramCheckerToTest.isAnagram(s, t));
    }

    public void testIsAnagram_when_oneEmpty() {
        ValidAnagram anagramCheckerToTest = new ValidAnagram();
        String s = "";
        String t = "null";
        assertFalse(anagramCheckerToTest.isAnagram(s, t));
    }
}