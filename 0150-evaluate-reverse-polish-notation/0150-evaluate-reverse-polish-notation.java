class Solution {
    public boolean operator( String tokens){
        return tokens.equals("+")|| tokens.equals("-")||tokens.equals("*")||tokens.equals("/");
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(operator(token)){
                int b=stack.pop();
                int a=stack.pop();
                int result = isresult( a, b, token);
                stack.push(result);

            } else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
        public int isresult(int a,int b,String op){
            switch(op){
                case "+": return a+b;
                 case "-": return a-b;
                  case "*": return a*b;
                   case "/": return a/b;
            }
            return 0;
        }
        
        
    }
