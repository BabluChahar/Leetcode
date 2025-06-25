class Solution {
    public int maxFrequencyElements(int[] nums) {
        int fre[]= new int[101];
        for(int num:nums){
            fre[num]++;
        }
        int max=0;
        for(int i=0;i<101;i++){
            max=Math.max(fre[i],max);
        }
        int total=0;
        for(int i=0;i<fre.length;i++){
            if(max==fre[i]){
                total=total+max;
            }
        }
        return total;
        
    }
}