package ru.rita.simple.java.lists;

import junit.framework.TestCase;

public class MergeKSortedListsTest extends TestCase {
    public void testMergeKLists_when_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        assertNull(sorter.mergeKLists(null));
    }

    public void testMergeKLists_when_empty() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNode[] lists = {};
        assertNull(sorter.mergeKLists(lists));
    }

    public void testMergeKLists_when_one_list_inside_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();

        ListNode[] lists = {null};
        assertNull( sorter.mergeKLists(lists));
    }

    public void testMergeKLists_when_all_lists_inside_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();

        ListNode[] lists = {null, null, null};
        assertNull( sorter.mergeKLists(lists));
    }

    public void testMergeKLists_when_one_list_not_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNodeComparator comparator = new ListNodeComparator();

        ListNode list1 = new ListNode(2);
        ListNode[] lists = {null, list1};

        ListNode result = sorter.mergeKLists(lists);

        assertEquals(0, comparator.compare(list1, result));
    }

    public void testMergeKLists_when_two_lists_not_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNodeComparator comparator = new ListNodeComparator();

        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode list2 = new ListNode(4, new ListNode(9, new ListNode(10)));
        ListNode[] lists = {list1, list2};

        ListNode expectedResult = new ListNode(2, new ListNode(4,
                new ListNode(4, new ListNode(6, new ListNode(9,
                        new ListNode(10))))));
        ListNode result = sorter.mergeKLists(lists);

        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testMergeKLists_when_three_lists_not_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNodeComparator comparator = new ListNodeComparator();

        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        ListNode expectedResult = new ListNode(1, new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4,
                        new ListNode(5, new ListNode(6))))))));

        ListNode[] lists = {list1, list2, list3};

        ListNode result = sorter.mergeKLists(lists);

        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testMergeKLists_when_four_lists_not_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNodeComparator comparator = new ListNodeComparator();

        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));
        ListNode list4 = new ListNode(5, new ListNode(8));

        ListNode expectedResult = new ListNode(1, new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4,
                        new ListNode(5, new ListNode(5, new ListNode(6, new ListNode(8))))))))));

        ListNode[] lists = {list1, list2, list3, list4};

        ListNode result = sorter.mergeKLists(lists);

        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testMergeKLists_when_five_lists_not_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNodeComparator comparator = new ListNodeComparator();

        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));
        ListNode list4 = new ListNode(5, new ListNode(8));
        ListNode list5 = new ListNode(3, new ListNode(5));

        ListNode expectedResult = new ListNode(1, new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4,
                        new ListNode(4, new ListNode(5, new ListNode(5, new ListNode(5, new ListNode(6, new ListNode(8))))))))))));

        ListNode[] lists = {list1, list2, list3, list4, list5};

        ListNode result = sorter.mergeKLists(lists);

        assertEquals(0, comparator.compare(expectedResult, result));
    }

    public void testMergeKLists_when_lists_mixed_with_null() {
        MergeKSortedLists sorter = new MergeKSortedLists();
        ListNodeComparator comparator = new ListNodeComparator();

        ListNode list1 = new ListNode(3, new ListNode(4, new ListNode(10)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(8, new ListNode(11))));
        ListNode list3 = new ListNode(2, new ListNode(6));

        ListNode expectedResult = new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(6,
                        new ListNode(8, new ListNode(10, new ListNode(11)))))))));

        ListNode[] lists = {list1, list2, null, list3};

        ListNode result = sorter.mergeKLists(lists);

        assertEquals(0, comparator.compare(expectedResult, result));
    }

}