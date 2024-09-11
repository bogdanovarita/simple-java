package ru.rita.simple.java.hashtable;

import junit.framework.TestCase;

import java.util.List;

public class ListOfListComparatorTest extends TestCase {

    public void testCompare_when_both_null() {
        List<List<Integer>> list1 = null;
        List<List<Integer>> list2 = null;
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = 0;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_one_null() {
        List<List<Integer>> list1 = List.of(List.of(1, 2), List.of(3, 4));
        List<List<Integer>> list2 = null;
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = -1;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_one_null_1() {
        List<List<Integer>> list1 = null;
        List<List<Integer>> list2 = List.of(List.of(1, 2), List.of(3, 4));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = -1;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_length_different() {
        List<List<Integer>> list1 = List.of(List.of(1, 2));
        List<List<Integer>> list2 = List.of(List.of(1, 2), List.of(3, 4));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = -1;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_length_same_not_equals() {
        List<List<Integer>> list1 = List.of(List.of(1, 2));
        List<List<Integer>> list2 = List.of(List.of(3, 4));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = -1;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_length_same_equals() {
        List<List<Integer>> list1 = List.of(List.of(1, 2));
        List<List<Integer>> list2 = List.of(List.of(2, 1));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = 0;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_equals_and_order_different() {
        List<List<Integer>> list1 = List.of(List.of(1, 2), List.of(3, 4));
        List<List<Integer>> list2 = List.of(List.of(4, 3), List.of(2, 1));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = 0;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_not_equals_and_order_different() {
        List<List<Integer>> list1 = List.of(List.of(1, 2), List.of(3, 4));
        List<List<Integer>> list2 = List.of(List.of(4, 3), List.of(2, 1, 5));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = -1;
        assertEquals(expected, comparator.compare(list1, list2));
    }

    public void testCompare_when_not_equals() {
        List<List<Integer>> list1 = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
        List<List<Integer>> list2 = List.of(List.of(1, 2), List.of(3, 4), List.of(6, 6));
        ListOfListComparator comparator = new ListOfListComparator();
        int expected = -1;
        assertEquals(expected, comparator.compare(list1, list2));
    }
}