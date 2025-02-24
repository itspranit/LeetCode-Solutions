🟢 Longest Substring Without Repeating Characters (Medium)

🔹 Problem Statement

Given a string s, find the length of the longest substring without repeating characters.

Example:

Input:

s = "abcabcbb"

Output:

3

Explanation:
The answer is "abc", with a length of 3.

🔹 Approach 1: Sliding Window (O(N)) ✅

Use a HashSet to keep track of characters in the current window.

Expand the window by moving the right pointer and adding characters.

If a duplicate is found, shrink the window from the left until there are no duplicates.

Update the max length at each step.

Time Complexity: O(N)
Space Complexity: O(min(N, M)), where M is the character set size

🔹 Edge Cases Considered

✅ Empty string (e.g., "" should return 0)
✅ String with all unique characters (e.g., "abcdef" should return 6)
✅ String with all identical characters (e.g., "aaaaa" should return 1)
✅ String with special characters and spaces (e.g., "abc d e f" should return 6)

🔹 Java Code

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

🔹 Related Problems

🔹 LeetCode 76: Minimum Window Substring (similar sliding window technique)
🔹 LeetCode 159: Longest Substring with At Most Two Distinct Characters (variation of the problem)

