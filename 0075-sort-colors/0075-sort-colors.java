class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
      //  return nums;
    }
}
// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0, mid = 0, high = nums.length - 1;
//         while (mid <= high) {
//             switch (nums[mid]) {
//                 case 0:
//                     swap(nums, low++, mid++);
//                     break;
//                 case 1:
//                     mid++;
//                     break;
//                 case 2:
//                     swap(nums, mid, high--);
//                     break;
//             }
//         }
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }
