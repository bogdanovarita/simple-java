package ru.rita.simple.java.dfs;

/*
200. Number of Islands (Medium)
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands
horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 */
public class NumberOfIslandsRecursion {
    private char[][] grid;

    public int numIslands(char[][] grid) {
        this.grid = grid;

        int result = 0;

        if (grid == null || grid.length == 0) {
            return result;
        }

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == '1') {
                    result++;
                    removeIreland(row, column);
                }
            }
        }
        return result;
    }

    private void removeIreland(int row, int column) {
        if (row < 0 || row >= grid.length ||
                column < 0 || column >= grid[0].length) {
            return;
        }
        if (grid[row][column] == '1') {
            grid[row][column] = '0';
            removeIreland(row - 1, column);
            removeIreland(row + 1, column);
            removeIreland(row, column + 1);
            removeIreland(row, column - 1);
        }
    }
}
