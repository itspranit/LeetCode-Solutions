import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store grouped anagrams
        Map<String, List<String>> groups = new HashMap<>();

        // Iterate through each string in the input array
        for (String s : strs) {
            // Convert the string to a character array and sort it
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            // Convert the sorted character array back to a string (this becomes the key)
            String key = new String(arr);

            // If the key is not present in the map, initialize a new list
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<String>());
            }

            // Add the original string to the corresponding anagram group
            groups.get(key).add(s);
        }

        // Convert the values (lists of anagrams) to an ArrayList and return the result
        return new ArrayList<>(groups.values());
    }
}
