package ru.rita.simple.java.tree;

import java.util.ArrayList;
import java.util.List;

/*
113. Path Sum II (Medium)
https://leetcode.com/problems/path-sum-ii/description/

Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths
where the sum of the node values in the path equals targetSum.
Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node.
A leaf is a node with no children.

 */
public class PathSumII {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> currentList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        getPath(root, targetSum);
        return result;
    }

    private void getPath(TreeNode node, int remainSum) {
        if (node == null) {
            return;
        }
        currentList.add(node.val);
        if ((remainSum - node.val == 0) && node.left == null && node.right == null) {
            result.add(new ArrayList<>(currentList));
        }
        getPath(node.left, remainSum - node.val);
        getPath(node.right, remainSum - node.val);
        currentList.remove(currentList.size() - 1);
    }
}
