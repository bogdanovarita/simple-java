package ru.rita.simple.java.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
100. Same Tree Easy
https://leetcode.com/problems/same-tree/description/
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class SameTree {
//    public boolean isSameTree(TreeNode tree1, TreeNode tree2) {
//        if (tree1 == null && tree2 == null) {
//            return true;
//        }
//        if (tree1 == null || tree2 == null || tree1.val != tree2.val) {
//            return false;
//        }
//
//        return (isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right));
//    }

    public boolean isSameTree(TreeNode tree1, TreeNode tree2) {
        Deque<TreeNode> stack1 = new LinkedList<>();
        Deque<TreeNode> stack2 = new LinkedList<>();

        stack1.add(tree1);
        stack2.add(tree2);

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            TreeNode node1 = stack1.poll();
            TreeNode node2 = stack2.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val){
                return false;
            }
            stack1.add(node1.left);
            stack1.add(node1.right);
            stack2.add(node2.left);
            stack2.add(node2.right);
        }

        return (stack1.isEmpty() && stack2.isEmpty());
    }
}
