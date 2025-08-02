class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else {
                h.put(nums[i],1);
            }

        }
        for(int key:h.keySet()){
            if(h.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}