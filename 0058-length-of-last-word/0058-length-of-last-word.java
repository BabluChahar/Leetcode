class Solution {
    public int lengthOfLastWord(String s) {
    String arr[]=s.trim().split("\\s+");

    String val= arr[arr.length-1];
    return val.length();
    }
}