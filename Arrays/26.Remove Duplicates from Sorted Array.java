class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, return 0
        if (nums.length == 0) return 0;

        int index = 1; // Pointer to place the next unique element

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i]; // Place the unique element at the next position
                index++; // Move the index forward
            }
        }

        return index; // Return the count of unique elements
    }
}
