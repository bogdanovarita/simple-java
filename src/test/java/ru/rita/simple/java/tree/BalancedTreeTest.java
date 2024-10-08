package ru.rita.simple.java.tree;

import junit.framework.TestCase;

public class BalancedTreeTest extends TestCase {

    public void testIsBalanced_when_root_null() {
        BalancedTree checker = new BalancedTree();
        assertTrue(checker.isBalanced(null));
    }

    public void testIsBalanced_when_one_node() {
        BalancedTree checker = new BalancedTree();
        assertTrue(checker.isBalanced(new TreeNode(2)));
    }

    public void testIsBalanced_when_three_nodes() {
        BalancedTree checker = new BalancedTree();
        assertTrue(checker.isBalanced(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

    public void testIsBalanced_when_balanced_with_levels_not_equal() {
        BalancedTree checker = new BalancedTree();
        assertTrue(checker.isBalanced(new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public void testIsBalanced_when_not_balanced() {
        BalancedTree checker = new BalancedTree();
        assertFalse(checker.isBalanced(new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2))));
    }
}