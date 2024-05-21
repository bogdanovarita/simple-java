package ru.rita.simple.java.lists;

import junit.framework.TestCase;

public class LinkedListCycleCheckerTest extends TestCase {

    public void testHasCycle_when_null() {
        LinkedListCycleChecker checker = new LinkedListCycleChecker();
        assertFalse(checker.hasCycle(null));
    }

    public void testHasCycle_when_one_elem() {
        LinkedListCycleChecker checker = new LinkedListCycleChecker();
        assertFalse(checker.hasCycle(new ListNode(5)));
    }

    public void testHasCycle_when_three_elems_no_cycle() {
        LinkedListCycleChecker checker = new LinkedListCycleChecker();
        assertFalse(checker.hasCycle(new ListNode(5, new ListNode(2, new ListNode(1)))));
    }

    public void testHasCycle_when_four_elems_with_cycle() {
        LinkedListCycleChecker checker = new LinkedListCycleChecker();
        ListNode lastElem = new ListNode(-4);
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, lastElem)));
        lastElem.next = head.next;
        assertTrue(checker.hasCycle(head));
    }

    public void testHasCycle_when_two_elems_with_cycle() {
        LinkedListCycleChecker checker = new LinkedListCycleChecker();
        ListNode lastElem = new ListNode(2);
        ListNode head = new ListNode(1, lastElem);
        lastElem.next = head;
        assertTrue(checker.hasCycle(head));
    }
}