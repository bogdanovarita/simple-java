package ru.rita.simple.java.tree;

import junit.framework.TestCase;

public class SymmetricTreeTest extends TestCase {

    public void testIsSymmetric_when_null() {
        SymmetricTree checker = new SymmetricTree();
        assertTrue(checker.isSymmetric(null));
    }

    public void testIsSymmetric_when_one_node() {
        SymmetricTree checker = new SymmetricTree();
        assertTrue(checker.isSymmetric(new TreeNode(2)));
    }

    public void testIsSymmetric_when_symmetric_without_nulls() {
        TreeNode tree = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        SymmetricTree checker = new SymmetricTree();
        assertTrue(checker.isSymmetric(tree));
    }

    public void testIsSymmetric_when_symmetric_with_nulls() {
        TreeNode tree = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), null));

        SymmetricTree checker = new SymmetricTree();
        assertTrue(checker.isSymmetric(tree));
    }

    public void testIsSymmetric_when_not_symmetric_without_nulls() {
        TreeNode tree = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(3), new TreeNode(4)));

        SymmetricTree checker = new SymmetricTree();
        assertFalse(checker.isSymmetric(tree));
    }

    public void testIsSymmetric_when_not_symmetric_with_nulls() {
        TreeNode tree = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));

        SymmetricTree checker = new SymmetricTree();
        assertFalse(checker.isSymmetric(tree));
    }

    public void testIsSymmetric_when_not_symmetric_with_nulls_1() {
        TreeNode tree = new TreeNode(9,
                new TreeNode(-42, null, new TreeNode(76, null, new TreeNode(13))),
                new TreeNode(-42, new TreeNode(76, null, new TreeNode(13)), null));

        SymmetricTree checker = new SymmetricTree();
        assertFalse(checker.isSymmetric(tree));
    }
}