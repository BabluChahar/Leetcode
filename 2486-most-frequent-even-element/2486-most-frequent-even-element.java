class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);

            } else if(nums[i]%2==0 &&!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
        }
        int min =0;
        int res=-1;
       for(int key:h.keySet()){
        int fre=h.get(key);
        
        if(fre>min ||( fre==min && key<res)){
            min=fre;
            res=key;
        }
       }
        return res;
    }
}