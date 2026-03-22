class Solution {
    public int majorityElement(int[] nums) {
        int m=nums.length;
        int n=nums.length/2;
        int ans=0;
        Map<Integer,Integer> dic=new HashMap<>();
        for(int i=0;i<m;i++){
              dic.put(nums[i],dic.getOrDefault(nums[i],0)+1);
        }
        for(int j:dic.keySet()){
            if(dic.get(j)>n){
               ans=j;
            }
        }
        return ans;
    }
}
