package ru.rita.simple.java.binarysearch;

/*
74. Search a 2D Matrix
https://leetcode.com/problems/search-a-2d-matrix/description/

You are given an m x n integer matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-10^4 <= matrix[i][j], target <= 10^4

 */
public class SearchInTwoDimensionalMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = findRowNumber(matrix, target);
        if (row == -1) {
            return false;
        }
        int left = 0;
        int right = matrix[row].length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (matrix[row][middle] == target) {
                return true;
            }
            if (matrix[row][middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    private int findRowNumber(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target >= matrix[middle][0] &&
                    target <= matrix[middle][matrix[middle].length - 1]) {
                return middle;
            }
            if (target > matrix[middle][matrix[middle].length - 1]) {
                left = middle + 1;
            } else if (target < matrix[middle][0]) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
