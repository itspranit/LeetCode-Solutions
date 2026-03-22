class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int i, j;
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                dp[i][j] = 1000000000;
            }
        }
        dp[m][n - 1] = 1;
        dp[m - 1][n] = 1;
        for (i = m - 1; i >= 0; i--) {
            for (j = n - 1; j >= 0; j--) {
                int next;
                if (dp[i + 1][j] < dp[i][j + 1]) {
                    next = dp[i + 1][j];
                } else {
                    next = dp[i][j + 1];
                }
                int need = next - dungeon[i][j];
                if (need <= 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = need;
                }
            }
        }
        return dp[0][0];
    }
}
