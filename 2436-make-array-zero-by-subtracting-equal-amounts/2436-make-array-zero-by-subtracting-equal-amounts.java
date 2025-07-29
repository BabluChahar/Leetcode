class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int sub=nums[i];
                for(int j=i;j<nums.length;j++){
                    nums[j]=nums[j]-sub;
                    
                }
                count++;
            }
           
        }
        return count;
        
    }
}