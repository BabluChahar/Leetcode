class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> h=new HashMap<>();
    int m=0;
    for(int i=0;i<nums.length;i++){
        m=target-nums[i];
        if(h.containsKey(m)){
            return new int[]{h.get(m),i};
            }
            else
            h.put(nums[i],i);
        }
    
  
    
    return new int[] {};
      
    }
}