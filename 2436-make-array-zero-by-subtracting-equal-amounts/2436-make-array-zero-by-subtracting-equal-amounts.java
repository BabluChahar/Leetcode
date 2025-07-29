// optimise code
import java.util.*;
class Solution{
    public int minimumOperations(int []nums){
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            if(num!=0){
                s.add(num);
            }
        }
        return s.size();
    }
}
// class Solution {
//     public int minimumOperations(int[] nums) {
//         Arrays.sort(nums);
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 int sub=nums[i];
//                 for(int j=i;j<nums.length;j++){
//                     nums[j]=nums[j]-sub;
                    
//                 }
//                 count++;
//             }
           
//         }
//         return count;
        
//     }
// }
