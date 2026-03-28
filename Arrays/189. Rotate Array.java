/*class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        while(k--!=0){
            int item=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                nums[i+1]=nums[i];
            }
            nums[0]=item;
        }
    }
}*/
/*class Solution{
    public void rotate(int[] nums, int k){


    }

    public void swapping(){
        int i=0;
        int j=nums.length-1;
       while(i<=j){
          int temp=0;
          temp=nums[j];
          nums[j]=nums[i];
          nums[i]=temp;
          i++;
          j--;
       }
      
    }

}*/
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        swapping(nums, 0, nums.length-1);
        swapping(nums, 0, k-1);
        swapping(nums, k, nums.length-1);
    }

    public void swapping(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
