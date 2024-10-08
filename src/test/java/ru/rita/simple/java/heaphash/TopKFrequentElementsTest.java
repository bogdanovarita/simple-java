package ru.rita.simple.java.heaphash;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class TopKFrequentElementsTest extends TestCase {

    public void testTopKFrequent_whenOneElem_thenExpectOneElem() {
        TopKFrequentElements testClass = new TopKFrequentElements();
        int[] testData = new int[]{1};
        int k = 1;
        int[] expectedData = new int[]{1};
        assertArrayEquals(expectedData, testClass.topKFrequent(testData, k));
    }

    public void testTopKFrequent_whenKLessThenArraySide_thenExpectTwoElems() {
        TopKFrequentElements testClass = new TopKFrequentElements();
        int[] testData = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expectedData = new int[]{1, 2};
        assertArrayEquals(expectedData, testClass.topKFrequent(testData, k));
    }

    public void testTopKFrequent_whenKArrayHasEqualElemsAndKEqualsArrayLength_thenExpectFullArray() {
        TopKFrequentElements testClass = new TopKFrequentElements();
        int[] testData = new int[]{1, 2, 3, 4};
        int k = 4;
        int[] expectedData = new int[]{1, 2, 3, 4};
        assertArrayEquals(expectedData, testClass.topKFrequent(testData, k));
    }

    public void testTopKFrequent_whenKArrayHasEqualElemsAndKLessArrayLength_thenKLenghtArray() {
        TopKFrequentElements testClass = new TopKFrequentElements();
        int[] testData = new int[]{1, 2, 3, 4};
        int k = 3;
        int[] expectedData = new int[]{1, 2, 3};
        assertArrayEquals(expectedData, testClass.topKFrequent(testData, k));
    }

    public void testTopKFrequent_whenKLessThenZero_thenExpectException() {
        TopKFrequentElements testClass = new TopKFrequentElements();
        int[] testData = new int[]{1, 2, 3, 4};
        int k = -1;

        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> testClass.topKFrequent(testData, k));

        // assertions on the thrown exception
        assertEquals("We expect not empty array and k > 0.", thrown.getMessage());
    }
}