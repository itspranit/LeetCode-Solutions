class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array has 2 or fewer elements, no need to modify it
        if (nums.length <= 2) {
            return nums.length;
        }

        // Index to place the next valid element
        int index = 2;

        // Start checking from the third element
        for (int i = 2; i < nums.length; i++) {
            // Only allow the current element if it's not the same as the element
            // two positions before the current insert position
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i]; // Place the element at the current index
                index++; // Move the insert position forward
            }
        }

        // Return the new length of the array after removing extra duplicates
        return index;
    }
}
