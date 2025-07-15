class Solution {
    public int maximumCount(int[] nums) {
        int k=firstNegative(nums)+1;
        int l=nums.length-firstPositive(nums);
        return Math.max(k,l);
        
    }
     public int firstNegative(int []nums){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            
                if(nums[mid]<0){
                    ans=mid;
                    start=mid+1;
                }
                else{
                      end=mid-1;
            }
        }
  return ans;
        }
    public int firstPositive(int []nums){
        int start=0;
        int end=nums.length-1;
        int ans=nums.length;
        while(end>=start){
            int mid=start+(end-start)/2;
            
                if(nums[mid]>0){
                    ans=mid;
                    end=mid-1;
                }
                else{
                start=mid+1;
                }
            }
  return ans;
        }
    
}