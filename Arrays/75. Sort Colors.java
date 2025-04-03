class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0, n = nums.length;
        
        // Count the number of 0s and 1s in the array
        for(int num : nums) {
            if(num == 0) zeros++;
            else if(num == 1) ones++;
        }  

        // Fill the array with 0s first
        for(int i = 0; i < zeros; ++i) {
            nums[i] = 0;
        }

        // Fill the next positions with 1s
        for(int i = zeros; i < zeros + ones; ++i) {
            nums[i] = 1;
        }

        // Fill the remaining positions with 2s
        for(int i = zeros + ones; i < n; ++i) {
            nums[i] = 2;
        }
    }
}
