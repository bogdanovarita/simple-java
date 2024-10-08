package ru.rita.simple.java.dfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class NumberOfIslandsStack {

    private class RowColumn {
        int row;
        int column;

        public RowColumn(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public int numIslands(char[][] grid) {

        int result = 0;

        if (grid == null || grid.length == 0) {
            return result;
        }

        Deque<RowColumn> removeIrelandStack = new LinkedList<>();

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == '1') {
                    result++;
                    removeIrelandStack.add(new RowColumn(row, column));
                    while (!removeIrelandStack.isEmpty()) {
                        RowColumn current = removeIrelandStack.poll();
                        if (current == null || current.row < 0 || current.row >= grid.length ||
                                current.column < 0 || current.column >= grid[0].length) {
                            continue;
                        }
                        if (grid[current.row][current.column] == '1') {
                            grid[current.row][current.column] = '0';
                            removeIrelandStack.add(new RowColumn(current.row + 1, current.column));
                            removeIrelandStack.add(new RowColumn(current.row - 1, current.column));
                            removeIrelandStack.add(new RowColumn(current.row, current.column + 1));
                            removeIrelandStack.add(new RowColumn(current.row, current.column - 1));
                        }
                    }
                }
            }
        }
        return result;
    }
}
