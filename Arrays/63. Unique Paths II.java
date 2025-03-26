import java.util.Arrays;

class Solution {
    int[][] memo; // Memoization table to store previously computed results
    int[][] obstacleGrid; // Reference to the obstacle grid

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        this.obstacleGrid = obstacleGrid;
        
        // Initialize memoization table with -1 (indicating uncomputed values)
        memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        // Start recursive DP function from the bottom-right corner
        return dp(m - 1, n - 1);
    }

    public int dp(int row, int col) {
        // Base case: If out of bounds or cell is an obstacle, return 0
        if (row < 0 || col < 0 || obstacleGrid[row][col] == 1) {
            return 0;
        }
        
        // Base case: If at the start cell, return 1 (if it's not an obstacle)
        if (row == 0 && col == 0) {
            return 1;
        }
        
        // Return the result if already computed
        if (memo[row][col] != -1) {
            return memo[row][col];
        }

        int ways = 0;

        // Compute ways from the cell above (if within bounds and not an obstacle)
        if (row > 0 && obstacleGrid[row - 1][col] == 0) {
            ways += dp(row - 1, col);
        }

        // Compute ways from the cell to the left (if within bounds and not an obstacle)
        if (col > 0 && obstacleGrid[row][col - 1] == 0) {
            ways += dp(row, col - 1);
        }

        // Store computed result in memoization table
        memo[row][col] = ways;
        return ways;
    }
}
