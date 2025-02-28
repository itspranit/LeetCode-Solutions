class Solution {
    public int maxArea(int[] height) {
        int n = height.length; // Get the length of the height array
        int area = 0; // Variable to store the maximum area
        int i = 0; // Left pointer starting at the beginning
        int j = n - 1; // Right pointer starting at the end
        
        // Loop until the two pointers meet
        while (i < j) {
            // Calculate the current area and update the maximum area
            area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            
            // Move the pointer pointing to the smaller height
            if (height[i] <= height[j]) {
              
                i++; // Move left pointer forward
              
            } else {
              
                j--; // Move right pointer backward
              
            }
        }
        
        return area; // Return the maximum area found
    }
}
