// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//        int n=nums.length;
//        if(n<3){
//         return false;

//        }
//        for(int i=0;i<n-2;i++){
//         for(int j=i+1;j<n-1;j++){
//             if(nums[j]<=nums[i]) continue;
        
//         for(int k=j+1;k<n;k++){
//             if(nums[k]>nums[j]){
//                 return true;
//             }
//         }
//         }
//        }
//        return false;

//     }
// }
// ABOVE CODE HAS TIME COMPLEXITY ISSUE , TIME COMPLEXITY EXCEEDED
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;        
            } else if (num <= second) {
                second = num;        
            } else {
                return true;         
            }
        }
        return false;
    }
}
