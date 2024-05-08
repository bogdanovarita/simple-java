package ru.rita.simple.java.lists;

import junit.framework.TestCase;

public class ListNodeComparatorTest extends TestCase {
    public void testCompare_when_both_null() {
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(0, comparator.compare(null, null));
    }

    public void testCompare_when_first_null() {
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(-1, comparator.compare(null, new ListNode(2)));
    }

    public void testCompare_when_second_null() {
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(-1, comparator.compare(new ListNode(2), null));
    }

    public void testCompare_when_equals() {
        ListNodeComparator comparator = new ListNodeComparator();
        ListNode list1 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode list2 = new ListNode(2, new ListNode(3, new ListNode(4)));
        assertEquals(0, comparator.compare(list1, list2));
    }

    public void testCompare_when_not_equals_one_size() {
        ListNodeComparator comparator = new ListNodeComparator();
        ListNode list1 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(4)));
        assertEquals(-1, comparator.compare(list1, list2));
    }

    public void testCompare_when_not_equals_different_size() {
        ListNodeComparator comparator = new ListNodeComparator();
        ListNode list1 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode list2 = new ListNode(2, new ListNode(4));
        assertEquals(-1, comparator.compare(list1, list2));
    }

}