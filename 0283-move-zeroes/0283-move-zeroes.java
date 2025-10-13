class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        if(nums[0]==0 && nums.length<=1){
            nums[0]=0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int j=k;j<nums.length;j++){
            nums[j]=0;
        }
    }
}