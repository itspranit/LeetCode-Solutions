class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0; // Variable to store the length of the last word

        // Loop through the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            // If a space is encountered
            if (s.charAt(i) == ' ') {
                // If length is greater than 0, it means we have found a word, so return its length
                if (length > 0) {
                    return length;
                }
            } else {
                // If it's not a space, increase the length counter
                length++;
            }
        }
        
        // Return the computed length of the last word
        return length;
    }
}
