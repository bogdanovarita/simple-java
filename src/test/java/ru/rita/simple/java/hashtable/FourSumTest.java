package ru.rita.simple.java.hashtable;

import junit.framework.TestCase;

import java.util.Collections;
import java.util.List;

public class FourSumTest extends TestCase {

    public void testFourSum_case_one() {
        FourSum finder = new FourSum();
        List<List<Integer>> result = finder.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> expected = List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
        ListOfListComparator comparator = new ListOfListComparator();
        assertEquals(0, comparator.compare(expected, result));
    }

    public void testFourSum_when_all_elems_are_equals() {
        FourSum finder = new FourSum();
        List<List<Integer>> result = finder.fourSum(new int[]{2, 2, 2, 2, 2}, 0);
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2, 2));
        ListOfListComparator comparator = new ListOfListComparator();
        assertEquals(0, comparator.compare(expected, result));
    }

    public void testFourSum_when_all_elems_are_equals_and_target_not_exists() {
        FourSum finder = new FourSum();
        List<List<Integer>> result = finder.fourSum(new int[]{2, 2, 2, 2, 2}, 1);
        List<List<Integer>> expected = Collections.emptyList();
        ListOfListComparator comparator = new ListOfListComparator();
        assertEquals(0, comparator.compare(expected, result));
    }
}