class Solution {
    public String largestOddNumber(String num) {
       
        int i=num.length()-1;
        if((num.charAt(i) -'0')%2!=0){
            return num;
        }
         while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
         }
      return "";
        
    }
}
  // String str = "";
        // for (int i = num.length() - 1; i >= 0; i--) {
        //     int value = (int)num.charAt(i) ;
        //     if (value % 2 != 0) {
        //         str = num.substring(0, i + 1);
        //         break;
        //     }
        // }
        // return str;
