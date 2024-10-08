package ru.rita.simple.java.tree;

import junit.framework.TestCase;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SameTreeTest extends TestCase {

    public void testIsSameTree() {
    }

    public void testTestIsSameTree_test1() {
        SameTree testClass = new SameTree();
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        assertTrue(testClass.isSameTree(tree1, tree2));
    }

    public void testTestIsSameTree_test2() {
        SameTree testClass = new SameTree();
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode tree2 = new TreeNode(1, null, new TreeNode(2));
        assertFalse(testClass.isSameTree(tree1, tree2));
    }

    public void testTestIsSameTree_test3() {
        SameTree testClass = new SameTree();
        TreeNode tree1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), null);
        TreeNode tree2 = new TreeNode(1, null, new TreeNode(2, new TreeNode(4), null));
        assertFalse(testClass.isSameTree(tree1, tree2));
    }


    public void testTestIsSameTree_test4() {
        SameTree testClass = new SameTree();
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));
        assertTrue(testClass.isSameTree(tree1, tree2));
    }
}