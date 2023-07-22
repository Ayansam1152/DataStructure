package dataStructureImplementation.Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] ayn){
        String s= toPostfix("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(s);
        // answer should be abcd^e-fgh*+^*+i-
    }

    public static int prec(char c){
        switch (c){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    public static String toPostfix(String s){
        String ans = new String();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // if character is letter or digit then output it on ans
            if(Character.isLetterOrDigit(ch)){
                ans+= ch;
            }

            else if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                while(!stk.isEmpty() && stk.peek() != '('){
                    ans += stk.pop();
                }
                stk.pop();
            }
            // operator is encounter
            else {
                while(!stk.isEmpty() && prec(ch) <= prec(stk.peek())){
                    ans += stk.pop();
                }
                stk.push(ch);
            }
        }
        while (!stk.isEmpty()){
            if(stk.peek() != '('){
                ans+= stk.pop();
            }else{
                return "Invalid string is Provided";
            }
        }
        return ans;
    }
}
