package ru.rita.simple.java.lists;

/*
https://leetcode.com/problems/reverse-linked-list/
206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
--------------
Example1:
--------------
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

-------------
Example 2:
-------------
Input: head = [1,2]
Output: [2,1]

-------------
Example 3:
-------------
Input: head = []
Output: []

 */

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

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode result = new ListNode(head.val);
        head = head.next;
        while (head != null) {
            ListNode newHead = new ListNode(head.val);
            newHead.next = result;
            result = newHead;
            head = head.next;
        }
        return result;
    }
}
