package ru.rita.simple.java.heaphash;

import junit.framework.TestCase;

import java.util.Collections;
import java.util.List;

public class TopKFrequentWordsTest extends TestCase {

    public void testTopKFrequent_whenArrayIsEmpty_thenExpectEmptyList() {
        TopKFrequentWords testClass = new TopKFrequentWords();
        String[] testData = new String[]{};
        List<String> expectedData = Collections.emptyList();
        assertEquals(expectedData, testClass.topKFrequent(testData, 1));
    }

    public void testTopKFrequent_whenTwoFrequentWords_thenExpectListWithTwoElems() {
        TopKFrequentWords testClass = new TopKFrequentWords();
        String[] testData = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        List<String> expectedData = List.of("i", "love");
        assertEquals(expectedData, testClass.topKFrequent(testData, 2));
    }

    public void testTopKFrequent_whenManyFrequentWords_thenExpectListWithFourElems() {
        TopKFrequentWords testClass = new TopKFrequentWords();
        String[] testData = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> expectedData = List.of("the", "is", "sunny", "day");
        assertEquals(expectedData, testClass.topKFrequent(testData, 4));
    }
}