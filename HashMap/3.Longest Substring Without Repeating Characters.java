class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int ans = 0;
        int start = 0;  // Start of the current substring
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            // If the character is already in the dictionary, update the start position
            if (dic.containsKey(c)) {
                start = Math.max(start, dic.get(c) + 1);
            }
            
            // Update the answer with the length of the current substring
            ans = Math.max(ans, end - start + 1);
            
            // Update the character's position
            dic.put(c, end);
        }
        
        return ans;
    }
}
