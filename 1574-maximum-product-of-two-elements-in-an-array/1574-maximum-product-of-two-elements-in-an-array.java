class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int secmax=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                secmax=max;
                max=nums[i];
            } else if(secmax<nums[i]){
                secmax=nums[i];
            }
        }
        int ans=(max-1)*(secmax-1);
        return ans;
        
    }
}