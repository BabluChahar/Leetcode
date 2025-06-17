class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int smax=-1;
        int n=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                int temp=max;
                max=nums[i];
                smax=temp;
                 n=i;
            }else if(nums[i]>smax){
                smax=nums[i];
            }

            

        }
        if(smax*2<=max){
            return n;
        }
        return -1;
    }
}
// class Solution {
//     public int dominantIndex(int[] nums) {
//         int max = -1;
//         int smax = -1;
//         int index = -1;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > max) {
//                 smax = max;      // old max becomes second max
//                 max = nums[i];   // new max
//                 index = i;       // store index of max
//             } else if (nums[i] > smax) {
//                 smax = nums[i];
//             }
//         }

//         if (max >= 2 * smax) {
//             return index;
//         }
//         return -1;
//     }
// }