class Solution {
    public int strStr(String haystack, String needle) {
        // Get the length of both strings
        int hayLen = haystack.length();
        int needleLen = needle.length();
        
        // Iterate through the haystack while ensuring we don't exceed bounds
        for (int i = 0; i <= hayLen - needleLen; i++) {
            // Check if the substring starting at index i matches the needle
            if (haystack.startsWith(needle, i)) {
                return i; // Return the index where the match starts
            }
        }
        
        // If no match is found, return -1
        return -1;
    }
}
