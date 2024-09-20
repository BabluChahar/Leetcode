class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int end=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=end){
            int mid=low+(end-low)/2;
            if(nums[low]<=nums[end]){
                ans=Math.min(ans,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;

            }
            else{
                 ans=Math.min(ans,nums[mid]);
                 end=mid-1;

            }
        }
        return ans;
        
    }
}