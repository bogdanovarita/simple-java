package ru.rita.simple.java.tree;
/*
101. Symmetric Tree (Easy)

https://leetcode.com/problems/symmetric-tree/description/

Given the root of a binary tree,
check whether it is a mirror of itself (i.e., symmetric around its center).
 */

import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null || (root.left == null && root.right == null)) {
//            return true;
//        }
//
//        Deque<TreeNode> stack1 = new LinkedList<>();
//        Deque<TreeNode> stack2 = new LinkedList<>();
//
//        stack1.add(root.left);
//        stack2.add(root.right);
//
//        while (!stack1.isEmpty() && !stack2.isEmpty()) {
//            TreeNode node1 = stack1.poll();
//            TreeNode node2 = stack2.poll();
//            if (node1 == null && node2 == null) {
//                continue;
//            }
//            if (node1 == null || node2 == null || node1.val != node2.val) {
//                return false;
//            }
//            stack1.add(node1.left);
//            stack1.add(node1.right);
//            stack2.add(node2.right);
//            stack2.add(node2.left);
//        }
//
//        return (stack1.isEmpty() && stack2.isEmpty());
//    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null || tree1.val != tree2.val) {
            return false;
        }

        return (isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left));
    }
}
