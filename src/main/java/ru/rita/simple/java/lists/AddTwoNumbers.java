package ru.rita.simple.java.lists;

/*
https://leetcode.com/problems/add-two-numbers/description/
Medium
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

// In the algorithm I do not use new list and result of sum is in the list1.
// Such solution is faster, but it is not recommended to change one of income parameters.
// In production I would recommend to use new list for result.

// Complexity:
//       time: O(N+M) - N - length of list1, M - length of list2
//       memory: O(1)
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode result = list1;
        ListNode prev_list1 = list1;
        int the_rest = 0;
        while (list1 != null && list2 != null) {
            list1.val = list1.val + list2.val + the_rest;
            if (list1.val > 9) {
                list1.val = list1.val - 10;
                the_rest = 1;
            } else {
                the_rest = 0;
            }
            prev_list1 = list1;
            list1 = list1.next;
            list2 = list2.next;
        }

        if (list2 != null) {
            prev_list1.next = list2;
            list1 = list2;
        }

        while (list1 != null && the_rest != 0) {
            list1.val = list1.val + the_rest;
            if (list1.val > 9) {
                list1.val = list1.val - 10;
            } else {
                the_rest = 0;
            }
            prev_list1 = list1;
            list1 = list1.next;
        }

        if (the_rest == 1) {
            prev_list1.next = new ListNode(1);
        }

        return result;
    }
}
