package ru.rita.simple.java.lists;
// ----------------------------------------
// Simple Task to merge 2 sorted lists
//----------------------------------------
//https://leetcode.com/problems/merge-two-sorted-lists/

//You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted list.
// The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Checks
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Fill head element
        ListNode head;
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        // Main cycle
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Fill tail
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return head;
    }
}
