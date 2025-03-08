import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Sort the array to make it easier to handle duplicates and use the two-pointer technique
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the array with the first pointer (i)
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicate values for the first number to avoid duplicate quadruplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Iterate with the second pointer (j), starting from i+1
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicate values for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Two-pointer approach for finding the remaining two numbers
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    // Calculate the sum using long to prevent integer overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum > target) {
                        // If the sum is greater than the target, move the right pointer left to reduce sum
                        right--;
                    } else if (sum < target) {
                        // If the sum is smaller, move the left pointer right to increase sum
                        left++;
                    } else {
                        // Found a valid quadruplet, add it to the result list
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicate values for left pointer
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        // Skip duplicate values for right pointer
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }

        return result;
    }
}
