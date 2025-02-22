# 🟢 Two Sum (Easy)

## 🔹 Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers that add up to `target`.

### Example:
**Input:** nums = [2,7,11,15], target = 9  
**Output:** [0,1]  
**Explanation:** nums[0] + nums[1] = 2 + 7 = 9

---

## 🔹 Approach 1: Brute Force (O(n²))
- Use **nested loops** to check every pair of numbers.
- **Time Complexity:** O(n²)

## 🔹 Approach 2: HashMap (Optimized O(n)) ✅
- Use a **HashMap** to store visited numbers.
- Check if `target - current_number` exists in the map.
- **Time Complexity:** O(n)

---

## 🔹 Java Code:
```java
import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
