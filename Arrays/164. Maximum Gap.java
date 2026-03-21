class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int left = 0, right = 1, maxGap = Integer.MIN_VALUE;
        while(right < nums.length){
            maxGap = Math.max(maxGap, nums[right] - nums[left]);
            right++;
            left++;
        }
        return maxGap;
    }
}
