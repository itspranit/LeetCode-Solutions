class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize maxSum with the smallest possible integer value
        int maxSum = Integer.MIN_VALUE;
        
        // Variable to keep track of the current subarray sum
        int currentSum = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current subarray sum
            currentSum += nums[i];

            // Update maxSum if the current sum is greater than the maxSum found so far
            maxSum = Math.max(maxSum, currentSum);

            // If currentSum becomes negative, reset it to 0
            // This is because a negative sum would reduce any future subarray sum
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        // Return the maximum sum found
        return maxSum;
    }
}
