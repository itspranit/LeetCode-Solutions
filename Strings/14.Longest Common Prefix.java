import java.util.Arrays; // Importing Arrays class for sorting

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int inx = 0; 
        Arrays.sort(strs);
        String s1 = strs[0]; 
        String s2 = strs[strs.length - 1]; 

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
