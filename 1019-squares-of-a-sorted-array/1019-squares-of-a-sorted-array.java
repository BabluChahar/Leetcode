class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int ptr=nums.length-1;
        while(start<=end){
            int ss=nums[start]*nums[start];
            int se=nums[end]*nums[end];
            if(ss>se){
                ans[ptr]=ss;
                start++;
            } else{
                ans[ptr]=se;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}