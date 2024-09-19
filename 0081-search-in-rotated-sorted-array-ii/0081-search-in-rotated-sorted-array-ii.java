class Solution {
    public boolean search(int[] nums, int target) {
         int low=0;
        int end=nums.length-1;
        while(low<=end){
            int mid=low+(end-low)/2;
            if(nums[mid]==target){
                return true;}
                 if (nums[low] == nums[mid] && nums[mid] == nums[end]) {
                low = low + 1;
                end = end - 1;
                continue;
            }

            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    end=mid-1;
                }
                else
                low=mid+1;
            }
            else 
            if(nums[mid]<=target && target<=nums[end]){
                low=mid+1;
            }
            else
            end=mid-1;
        }
    
    return false;
        
    }
}