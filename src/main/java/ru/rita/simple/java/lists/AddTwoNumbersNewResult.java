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

// In the algorithm I use new list for result.

// Complexity:
//       time: O(N+M) - N - length of list1, M - length of list2
//       memory: O(1)
 */
public class AddTwoNumbersNewResult {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int caret = 0;
        while (list1 != null || list2 != null || caret != 0){
            int sum = 0;
            if (list1 != null) {
                sum = sum + list1.val;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum = sum + list2.val;
                list2 = list2.next;
            }
            sum = sum + caret;
//            Path1:
//---------------------------------
//            if (sum > 9) {
//                current.next = new ListNode(sum - 10);
//                caret = 1;
//            } else {
//                current.next = new ListNode(sum);
//                caret = 0;
//            }
//-------------------------------
//           Path2
            current.next = new ListNode(sum % 10);
            caret = sum/10;
            current = current.next;
        }
        return result.next;
    }
}
