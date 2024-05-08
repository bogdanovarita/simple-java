package ru.rita.simple.java.lists;

import junit.framework.TestCase;

public class MergeTwoSortedListsTest extends TestCase {

    public void testMergeTwoLists_when_both_lists_null() {
        MergeTwoSortedLists sortedLists = new MergeTwoSortedLists();
        ListNode result = sortedLists.mergeTwoLists(null, null);
        assertNull(result);
    }

    public void testMergeTwoLists_when_first_list_null() {
        MergeTwoSortedLists sortedLists = new MergeTwoSortedLists();
        ListNode list2 = new ListNode(2);
        ListNode result = sortedLists.mergeTwoLists(null, list2);
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(0, comparator.compare(result, list2));
    }

    public void testMergeTwoLists_when_second_list_null() {
        MergeTwoSortedLists sortedLists = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(2);
        ListNode result = sortedLists.mergeTwoLists(list1, null);
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(0, comparator.compare(result, list1));
    }

    public void testMergeTwoLists_when_both_not_empty() {
        MergeTwoSortedLists sortedLists = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode expectedResult = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4))))));

        ListNode result = sortedLists.mergeTwoLists(list1, list2);
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testMergeTwoLists_when_both_not_empty_and_have_same_values() {
        MergeTwoSortedLists sortedLists = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(1, new ListNode(4)));

        ListNode expectedResult = new ListNode(1, new ListNode(1, new ListNode(1,
                new ListNode(1, new ListNode(4, new ListNode(4))))));

        ListNode result = sortedLists.mergeTwoLists(list1, list2);
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testMergeTwoLists_when_both_not_empty_change_links_twice() {
        MergeTwoSortedLists sortedLists = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(3, new ListNode(4, new ListNode(10)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(8, new ListNode(11))));

        ListNode expectedResult = new ListNode(3, new ListNode(4, new ListNode(5,
                new ListNode(6, new ListNode(8, new ListNode(10, new ListNode(11)))))));

        ListNode result = sortedLists.mergeTwoLists(list1, list2);
        ListNodeComparator comparator = new ListNodeComparator();
        assertEquals(0, comparator.compare(expectedResult, result));
    }
}