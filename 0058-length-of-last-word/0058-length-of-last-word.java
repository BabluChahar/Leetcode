class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int n=s.length();
        int i=n-1;
        while(s.charAt(i)==' '){
            i--;
        }
        for(int j=i;j>=0;j--){
            if(s.charAt(j)==' '){
                return count;
            }
            else count++;
        }
        return count;
    }
}