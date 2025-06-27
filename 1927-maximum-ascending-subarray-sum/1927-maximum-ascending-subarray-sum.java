class Solution {
    public int maxAscendingSum(int[] nums) {

    int max=nums[0];
    int currsum=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            currsum=currsum+nums[i];
        }
        else{
            max=Math.max(currsum,max);
            currsum=nums[i];
        }
    } 
    max=Math.max(currsum,max);
    return max;   
    }
}