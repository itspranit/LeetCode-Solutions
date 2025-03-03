import java.util.Arrays; // Importing Arrays class for sorting

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int inx = 0; // Index to track the common prefix length
        
        // Sorting the array lexicographically
        Arrays.sort(strs);

        // The first and last strings in the sorted array
        String s1 = strs[0]; // First string (smallest lexicographically)
        String s2 = strs[strs.length - 1]; // Last string (largest lexicographically)

        // Compare characters of s1 and s2 to find the common prefix
        while (inx < s1.length() && inx < s2.length()) {
            if (s1.charAt(inx) == s2.charAt(inx)) {
                inx++; // Increment index if characters match
            } else {
                break; // Stop if characters don't match
            }
        }

        // Return the common prefix substring
        return s1.substring(0, inx);
    }
}
