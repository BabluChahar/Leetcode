class Solution {
    public int maxProfit(int[] prices) {
        int curr=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<curr){
                curr=prices[i];
            }
            else{
                max=Math.max(max,prices[i]-curr);
            }
        }
        return max;
    }
}