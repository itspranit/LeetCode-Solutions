class Solution {
    public int removeElement(int[] nums, int target) {
        int newLength = 0; // Pointer to track the new length of the modified array

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to the target value, keep it
            if (nums[i] != target) {
                nums[newLength] = nums[i]; // Overwrite element at newLength position
                newLength++; // Move pointer forward
            }
        }
        
        return newLength; // Return the new size of the array after removal
    }
}
