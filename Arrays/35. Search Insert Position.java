class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; // Initialize left pointer
        int right = nums.length - 1; // Initialize right pointer
        
        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid index
            
            if (nums[mid] == target) {
                return mid; // Target found, return its index
            } else if (nums[mid] > target) {
                right = mid - 1; // Move search to the left half
            } else {
                left = mid + 1; // Move search to the right half
            }
        }
        
        // If target is not found, return the insert position
        return left;
    }
}
