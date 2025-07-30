class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character> st1=new Stack<>();
          Stack<Character> st2=new Stack<>();
        StringBuilder sb1=new StringBuilder();
         StringBuilder sb2=new StringBuilder();
       for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!st1.isEmpty()) st1.pop();
            } else {
                st1.push(c);
            }
        }
        for(char c:st1){
            sb1.append(c);

        }
for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!st2.isEmpty()) st2.pop();
            } else {
                st2.push(c);
            }
        }
        for(char c:st2){
            sb2.append(c);

        }
      String str1=sb1.toString();
       String str2=sb2.toString();
       return str1.equals(str2);
       
    }
}