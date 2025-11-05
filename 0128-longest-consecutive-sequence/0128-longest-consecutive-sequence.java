class Solution{
    public int longestConsecutive(int [] nums){
       Set<Integer> s=new HashSet<>();
       if(nums.length==0) return 0;
       int curr=0;
       int max=0;
       int count=0;
       for(int n:nums){
        s.add(n);
       }
       for(int n:s){
        if(!s.contains(n-1)){
            count=1;
            curr=n;
            while(s.contains(curr+1)){
                count++;
   curr++;
            }
            max=Math.max(max,count);
            
        }
       }
       return max;
    }
}


// brute -force approach
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);
//         int count=1;
//         int max=1;
//         if(nums.length==0) return 0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 continue;
//             }
//             else if( nums[i+1]==nums[i]+1){
//                 count++;
//                 max=Math.max(count,max);

//             }
//             else{
//                 count=1;
//             }

//         }
//         return max;
//     }
// }