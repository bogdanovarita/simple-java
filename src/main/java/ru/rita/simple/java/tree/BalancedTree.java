package ru.rita.simple.java.tree;

/*
110. Balanced Binary Tree (Easy)
https://leetcode.com/problems/balanced-binary-tree/description/

Given a binary tree, determine if it is
height-balanced.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees
of every node never differs by more than one.

Input: root = [3,9,20,null,null,15,7]
Output: true

Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Input: root = []
Output: true
 */
public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        return getTreeHeight(root) >= 0;
    }

    private int getTreeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        var leftHeight = getTreeHeight(node.left);
        var rightHeight = getTreeHeight(node.right);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
