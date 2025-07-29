import java.util.*;
class Solution{
    public boolean containsDuplicate(int [] nums){
        Map<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i],i);
            }
            else {
                return true;
            }
        }
return false;
    }
}



// import java.util.Arrays;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums); 
        
        
//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }
// in this code time complexity limit is exceed that why we used this approach 

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] == nums[j]) {
                    
//                     return true;
                    
//                 }
//             }
//         }
//         return false;
//     }
// }
