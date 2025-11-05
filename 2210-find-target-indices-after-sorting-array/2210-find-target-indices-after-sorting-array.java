class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int tcount=0;
        int n=0;
        for(int ele:nums){
            if(ele==target){
                tcount++;
            } else if(ele<target){
                n++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(tcount>0){
            ans.add(n);
            n++;
            tcount--;

        }
        return ans;
    }
}