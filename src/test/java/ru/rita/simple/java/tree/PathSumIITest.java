package ru.rita.simple.java.tree;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathSumIITest extends TestCase {

    public void testPathSum_when_several_path_exists() {
        TreeNode tree = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        var targetSum = 22;

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(List.of(5, 4, 11, 2));
        expectedResult.add(List.of(5, 8, 4, 5));

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_no_path_exists() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var targetSum = 5;

        List<List<Integer>> expectedResult = Collections.emptyList();

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_no_path_exists_two_nodes_tree() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2),
                null);

        var targetSum = 0;

        List<List<Integer>> expectedResult = Collections.emptyList();

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_no_path_exists_one_node_tree() {
        TreeNode tree = new TreeNode(1);

        var targetSum = 0;

        List<List<Integer>> expectedResult = Collections.emptyList();

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_path_exists_one_node_tree() {
        TreeNode tree = new TreeNode(1);

        var targetSum = 1;

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(List.of(1));

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_path_exists_with_three_nodes() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var targetSum = 3;

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(List.of(1, 2));

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_path_exists_with_two_nodes_and_less_than_zero_values() {
        TreeNode tree = new TreeNode(-2,
                null,
                new TreeNode(-3));

        var targetSum = -5;

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(List.of(-2, -3));

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }

    public void testPathSum_when_path_exists_with_mixed_values() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(-2,
                        new TreeNode(1, new TreeNode(-1), null),
                        new TreeNode(3)),
                new TreeNode(-3, new TreeNode(-2), null));

        var targetSum = -1;

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(List.of(1, -2, 1, -1));

        PathSumII counter = new PathSumII();

        assertEquals(expectedResult, counter.pathSum(tree, targetSum));
    }
}