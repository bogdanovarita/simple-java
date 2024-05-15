package ru.rita.simple.java.lists;

/*
https://leetcode.com/problems/merge-k-sorted-lists/
You are given an array of k linked-lists lists,
each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.
---------------
Example 1:
---------------
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
---------------
Example 2:
--------------
Input: lists = []
Output: []

-------------
Example 3:
-------------
Input: lists = [[]]
Output: []

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
Divide and conquer algorithm with O(n*log(k))
n - total number of elements in all arrays
k - number of arrays
Good visualization: https://www.youtube.com/watch?v=vO961e332A4
Good explanation: https://www.youtube.com/watch?v=kpCesr9VXDA&t=613s
 */
public class MergeKSortedLists {
    private final MergeTwoSortedLists merger = new MergeTwoSortedLists();

    public ListNode mergeKLists(ListNode[] lists) {
        //checks
        if (lists == null || lists.length == 0) {
            return null;
        }
        int realArraysToMerge = lists.length;
        while (realArraysToMerge > 1){
            int currentIndexToMerge = 0;
            for (int firstIndexToMerge = 0; firstIndexToMerge < realArraysToMerge;
                 firstIndexToMerge = firstIndexToMerge + 2){
                if (firstIndexToMerge + 1 < realArraysToMerge){
                    lists[currentIndexToMerge] = merger.mergeTwoLists(lists[firstIndexToMerge],
                            lists[firstIndexToMerge + 1]);
                } else {
                    //last element does not have pair just move it
                    lists[currentIndexToMerge] = lists[firstIndexToMerge];
                }
                currentIndexToMerge = currentIndexToMerge + 1;
            }
            realArraysToMerge = currentIndexToMerge;
        }
        return lists[0];
    }

}
