class Solution {
    int n;
    int[][] memo;
    int[] prices;
    
    public int maxProfit(int[] prices)  {
        n = prices.length;
        memo = new int[n][2];
        for (int i = 0; i < n; i++) {
            
                Arrays.fill(memo[i], -1);
            
        }
        
        this.prices = prices;
        return dp(0,0,1);
    }
    
    public int dp(int i, int holding, int remain) {
        if (i == n || remain == 0) {
            return 0;
        }
        
        if (memo[i][holding]!= -1) {
            return memo[i][holding];
        }
        
        int ans = dp(i + 1, holding, remain);
        if (holding == 1) {
            ans = Math.max(ans, prices[i] + dp(i + 1, 0, remain - 1));
        } else {
            ans = Math.max(ans, -prices[i] + dp(i + 1, 1, remain));
        }
        
        memo[i][holding] = ans;
        return ans;
    }
}
