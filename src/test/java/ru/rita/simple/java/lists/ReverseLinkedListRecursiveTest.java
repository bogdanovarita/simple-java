package ru.rita.simple.java.lists;

import junit.framework.TestCase;

public class ReverseLinkedListRecursiveTest extends TestCase {
    private final ListNodeComparator comparator = new ListNodeComparator();

    public void testReverseList_when_list_null() {
        ReverseLinkedListRecursive worker = new ReverseLinkedListRecursive();
        assertNull(worker.reverseList(null));
    }

    public void testReverseList_when_list_contains_one_value() {
        ReverseLinkedListRecursive worker = new ReverseLinkedListRecursive();
        ListNode result = worker.reverseList(new ListNode(5));
        ListNode expectedResult = new ListNode(5);
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testReverseList_when_list_contains_three_values() {
        ReverseLinkedListRecursive worker = new ReverseLinkedListRecursive();
        ListNode result = worker.reverseList(new ListNode(5, new ListNode(4, new ListNode(3))));
        ListNode expectedResult = new ListNode(3, new ListNode(4, new ListNode(5)));
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testReverseList_when_list_contains_many_values() {
        ReverseLinkedListRecursive worker = new ReverseLinkedListRecursive();
        ListNode result = worker.reverseList(new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5))))));
        ListNode expectedResult = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2,
                new ListNode(1)))));
        assertEquals(0, comparator.compare(expectedResult, result));
    }

}