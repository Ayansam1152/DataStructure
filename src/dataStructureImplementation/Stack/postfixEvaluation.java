package dataStructureImplementation.Stack;

import java.util.Stack;

public class postfixEvaluation {
    public static  void main(String[] ayn){
        int s= PostFixEva("100 200 + 2 / 5 * 7 +");
        System.out.print(s);
    }

    public static int PostFixEva(String s){
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == ' ') continue;

            if(Character.isDigit(c)){
                stk.push(c-'0');
            }else{
                int p = stk.pop();
                int q = stk.pop();
                stk.push(operation(c,q,p));
            }
        }
        return stk.pop();
    }

    public static int operation(char c, int a, int b){
        switch (c){
            case '+':
                return a+b;

            case '-':
                return a-b;

            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                return -1;
        }
    }
}
