class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String ans="";
       int i=0;
         while(i<strs[0].length()){
            if(i>strs[strs.length-1].length()){
                return ans;

            }
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
              return ans;
            }
            ans=ans+strs[0].charAt(i);
            i++;
         }
        
        return ans; 
    }
}