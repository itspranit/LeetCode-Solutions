import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to enable the two-pointer approach
        Arrays.sort(nums);
        
        // Initialize the closest sum with the first three numbers
        int closestSum = nums[0] + nums[1] + nums[2]; 

        // Iterate through each number as a potential first element of the triplet
        for (int first = 0; first < nums.length - 2; first++) {
            int second = first + 1; // Second element pointer
            int third = nums.length - 1; // Third element pointer

            // Use a two-pointer approach to find the closest sum
            while (second < third) {
                int currentSum = nums[first] + nums[second] + nums[third];

                // Update closestSum if the current sum is closer to the target
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Adjust pointers based on the comparison with the target
                if (currentSum < target) {
                    second++; // Move second pointer to increase sum
                } else if (currentSum > target) {
                    third--; // Move third pointer to decrease sum
                } else {
                    return currentSum; // Exact match found, return immediately
                }
            }
        }

        return closestSum; // Return the closest sum found
    }
}
