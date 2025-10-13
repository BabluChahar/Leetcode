class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       int l=0;
       int temp[]=new int[n];
      for(int i=n-k;i<nums.length;i++){
        temp[l++]=nums[i];

      }
      for(int i=0;i<n-k;i++){
        temp[l++]=nums[i];
      }
      for(int i=0;i<nums.length;i++){
        nums[i]=temp[i];
      }

    }
}