package ru.rita.simple.java.twopointers;

import junit.framework.TestCase;

import java.util.List;

import static org.junit.Assert.assertThrows;

public class PartitionLabelsTest extends TestCase {

    public void testPartitionLabels_whenPartitionToThree_thenExpectThreeElems() {
        PartitionLabels testClass = new PartitionLabels();
        String testData = "ababcbacadefegdehijhklij";
        List<Integer> expected = List.of(9, 7, 8);
        assertEquals(expected, testClass.partitionLabels(testData));
    }

    public void testPartitionLabels_whenOnlyOnePartition_thenExpectOneElem() {
        PartitionLabels testClass = new PartitionLabels();
        String testData = "eccbbbbdec";
        List<Integer> expected = List.of(10);
        assertEquals(expected, testClass.partitionLabels(testData));
    }

    public void testPartitionLabels_whenDifferentLetters_thenExpectThreeElems() {
        PartitionLabels testClass = new PartitionLabels();
        String testData = "ababcbacadefegdehijhklij";
        List<Integer> expected = List.of(9, 7, 8);
        assertEquals(expected, testClass.partitionLabels(testData));
    }

    public void testPartitionLabels_whenSEmpty_thenExpectException() {
        PartitionLabels testClass = new PartitionLabels();
        String testData = "";
        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> testClass.partitionLabels(testData));
        assertEquals("String must not be null or empty.", thrown.getMessage());
    }

}