class Solution{
    public int longestConsecutive(int [] nums){
        Set<Integer> set=new HashSet<>();

        if(nums.length==0) return 0;
        int max=0;
        for(int n:nums){
            set.add(n);

        }
        for(int n: set){
            if(!set.contains(n-1)){
                int count=1;
                int curr=n;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                max=Math.max(count,max);
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