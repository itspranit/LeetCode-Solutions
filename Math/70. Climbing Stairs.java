class Solution {
    // Map to store the computed results for memoization
    Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        // Start from step 0 and calculate the total ways to reach step n
        return dp(0, n);
    }

    public int dp(int i, int n) {
        // If we exceed the number of steps, there is no valid way
        if (i > n) {
            return 0;
        }
        // If we reach exactly the nth step, we found one way
        if (i == n) {
            return 1;
        }
        // If the result for this step is already computed, return it
        if (map.containsKey(i)) {
            return map.get(i);
        }

        // Calculate the number of ways by taking one step and two steps
        map.put(i, dp(i + 1, n) + dp(i + 2, n));

        // Return the computed value
        return map.get(i);
    }
}
