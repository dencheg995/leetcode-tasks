package org.example;

public class NumberOfIslands200 {


    public int numIslands(char[][] grid) {
        int numberOfIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numberOfIsland++;
                    changeIslandNumbers(grid, i, j);
                }
            }
        }
        return numberOfIsland;
    }


    private void changeIslandNumbers(char[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= grid.length ||
                j >= grid[i].length || grid[i][j] != '1') {
            return;
        } else {
            grid[i][j] = '2';
        }

        changeIslandNumbers(grid, i - 1, j);
        changeIslandNumbers(grid, i, j - 1);
        changeIslandNumbers(grid, i, j + 1);
        changeIslandNumbers(grid, i + 1, j);

    }

}
