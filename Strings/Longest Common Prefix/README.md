# 🟢 Longest Common Prefix (Easy)

## 🔹 Problem Statement

Given an array of strings `strs`, find the longest common prefix shared among all strings. If there is no common prefix, return an empty string `""`.

### Example:

#### Input:
strs = ["flower", "flow", "flight"]


#### Output:
"fl"


#### Explanation:
The common prefix among all strings is `"fl"`.

---

## 🔹 Approach: Sorting (O(N log N)) ✅

1. **Sort the array**: Sorting ensures that the first and last strings in the array determine the longest common prefix.
2. **Compare first and last strings**: Since the array is sorted, the longest common prefix must be shared between the first and last elements.
3. **Character-wise comparison**: Iterate through the characters of both strings until a mismatch is found.
4. **Return the common prefix substring**.

### Time Complexity: 
- **O(N log N)** for sorting  
- **O(M)** for comparing the first and last string (where `M` is the length of the shortest string)  

### Space Complexity: 
- **O(1)** (Only a few variables are used; no extra data structures are required)

---

## 🔹 Edge Cases Considered

✅ Array with one string (e.g., `["single"]` should return `"single"`)  
✅ Array with all identical strings (e.g., `["test", "test", "test"]` should return `"test"`)  
✅ Array with no common prefix (e.g., `["dog", "racecar", "car"]` should return `""`)  
✅ Array containing an empty string (e.g., `["", "abc"]` should return `""`)  
✅ Large input with many strings (efficiency tested with large datasets)  

---

## 🔹 Java Code

```java
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int inx = 0; // Index to track common prefix length
        Arrays.sort(strs); // Sort the array lexicographically

        String s1 = strs[0]; // First string in sorted array
        String s2 = strs[strs.length - 1]; // Last string in sorted array

        while (inx < s1.length() && inx < s2.length()) {
            if (s1.charAt(inx) == s2.charAt(inx)) {
                inx++; // Increment if characters match
            } else {
                break; // Stop if a mismatch occurs
            }
        }

        return s1.substring(0, inx);
    }
}
🔹 Related Problems

🔹 LeetCode 14: Longest Common Prefix (this problem)
🔹 LeetCode 242: Valid Anagram (sorting-based string manipulation)
🔹 LeetCode 49: Group Anagrams (sorting-based string grouping)
