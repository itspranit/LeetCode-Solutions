import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to make it easier to avoid duplicates and use two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array, treating nums[i] as the first number in the triplet
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Use two-pointer technique to find pairs that sum to -nums[i]
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    // If sum is too large, decrease right pointer to reduce sum
                    right--;
                } else if (sum < 0) {
                    // If sum is too small, increase left pointer to increase sum
                    left++;
                } else {
                    // Found a valid triplet, add it to the result list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;

                    // Skip duplicate elements for the second number in the triplet
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
