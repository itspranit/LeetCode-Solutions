class Solution {
    public boolean isHappy(int n) {
        Set<Integer> ans=new HashSet<>();
        while(!ans.contains(n)){
            ans.add(n);
            int sum=0;
        while(n!=0){
            int temp=n%10;
             sum+=temp*temp;
            n=n/10;
        }
        n=sum;
        }
        return n==1;
    }
}
