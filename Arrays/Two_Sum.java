import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (table.containsKey(complement)) {
                return new int[] { table.get(complement), i };
            }
            table.put(nums[i], i);
        }
        return new int[0]; 
    }
}

}
