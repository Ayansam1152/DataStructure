package dataStructureImplementation.Stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] ayn){
        String s = toInfix("AB+CD-*");
        System.out.println(s);
    }

    public static boolean isOperand(char c){
        return (c >= 'a' && c <= 'z')||
                (c>='A'  && c <= 'Z');
    }

    public static String toInfix(String s){

        Stack<String> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isOperand(ch)){
                stk.push(ch+"");
            }else{
                String op2 = stk.peek();
                stk.pop();
                String op1 = stk.peek();
                stk.pop();
                stk.push("("+op1+ch+op2+")");

            }
        }
        return stk.peek();
    }
}

