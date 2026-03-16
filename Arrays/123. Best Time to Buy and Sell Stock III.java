class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int []leftfactors=new int[n];
       int minprice = prices[0];
       for(int i =1 ;i<n;i++){
        minprice = Math.min(minprice,prices[i]);
        leftfactors[i]=Math.max(leftfactors[i-1],prices[i]-minprice);
       } 
       int[]rightfactors = new int[n];
       int maxprice = prices[n-1];
       for(int i = n-2;i>=0;i--){
        maxprice=Math.max(maxprice,prices[i]);
        rightfactors[i]=Math.max(rightfactors[i+1],maxprice-prices[i]);
       }
       int maxprofit=0;
       for(int i =0;i<n;i++){
        maxprofit=Math.max(maxprofit,leftfactors[i]+rightfactors[i]);
       }
       return maxprofit;
    }
}
