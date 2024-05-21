package ru.rita.simple.java.lists;

import junit.framework.TestCase;

public class AddTwoNumbersTest extends TestCase {
    private final ListNodeComparator comparator = new ListNodeComparator();

    public void testAddTwoNumbers_when_both_null() {
        AddTwoNumbers adder = new AddTwoNumbers();
        assertNull(adder.addTwoNumbers(null, null));
    }

    public void testAddTwoNumbers_when_first_null() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(null, new ListNode(1));
        ListNode expectedResult = new ListNode(1);
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testAddTwoNumbers_when_second_null() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(new ListNode(4), null);
        ListNode expectedResult = new ListNode(4);
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testAddTwoNumbers_when_both_the_same_digits() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4))));
        ListNode expectedResult = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testAddTwoNumbers_when_one_zero() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(new ListNode(0),
                new ListNode(5, new ListNode(6, new ListNode(4))));
        ListNode expectedResult = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testAddTwoNumbers_when_both_zero() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(new ListNode(0),
                new ListNode(0));
        ListNode expectedResult = new ListNode(0);
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testAddTwoNumbers_when_different_digits() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        ListNode expectedResult = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testAddTwoNumbers_when_both_the_same_digits_add_new_rank() {
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9))),
                new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expectedResult = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(1))));
        assertEquals(0, comparator.compare(expectedResult, result));
    }
}