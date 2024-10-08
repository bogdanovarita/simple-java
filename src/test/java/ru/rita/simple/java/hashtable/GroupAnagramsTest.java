package ru.rita.simple.java.hashtable;

import junit.framework.TestCase;

import java.util.List;

public class GroupAnagramsTest extends TestCase {

    public void testGroupAnagrams_when_oneCharInString() {
        GroupAnagrams testClass = new GroupAnagrams();
        String[] testData = new String[] {"a"};
        List<List<String>> actualResult = testClass.groupAnagrams(testData);
        List<List<String>> expectedResult = List.of(List.of("a"));
        ListOfListComparator comparator = new ListOfListComparator();
        assertTrue(comparator.isTheSame(expectedResult, actualResult));
    }

    public void testGroupAnagrams_when_oneEmptyString() {
        GroupAnagrams testClass = new GroupAnagrams();
        String[] testData = new String[] {""};
        List<List<String>> actualResult = testClass.groupAnagrams(testData);
        List<List<String>> expectedResult = List.of(List.of(""));
        ListOfListComparator comparator = new ListOfListComparator();
        assertTrue(comparator.isTheSame(expectedResult, actualResult));
    }

    public void testGroupAnagrams_when_manyGroups() {
        GroupAnagrams testClass = new GroupAnagrams();
        String[] testData = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> actualResult = testClass.groupAnagrams(testData);
        List<List<String>> expectedResult = List.of(
                List.of("bat"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea"));
        ListOfListComparator comparator = new ListOfListComparator();
        assertTrue(comparator.isTheSame(expectedResult, actualResult));
    }

    public void testGroupAnagrams_when_differenceInOneChar() {
        GroupAnagrams testClass = new GroupAnagrams();
        String[] testData = new String[] {"bdddddddddd","bbbbbbbbbbc"};
        List<List<String>> actualResult = testClass.groupAnagrams(testData);
        List<List<String>> expectedResult = List.of(
                List.of("bdddddddddd"),
                List.of("bbbbbbbbbbc"));
        ListOfListComparator comparator = new ListOfListComparator();
        assertTrue(comparator.isTheSame(expectedResult, actualResult));
    }
}