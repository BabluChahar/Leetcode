class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String res="";
    for(int i=0;i<strs[0].length();i++){
        char c=strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            if(i>strs[j].length() || c!=strs[j].charAt(i)){
                return res;
            }
        }
        res+=c;
    }
    return res;
}
}