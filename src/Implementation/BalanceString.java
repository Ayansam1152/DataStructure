package Implementation;

import java.util.Scanner;
import java.util.Stack;

public class BalanceString {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(isBalance(s)){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }

    public static boolean isBalance(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            if(ch == ')'){
                if(stack.isEmpty()) return false;
                if(stack.peek() != '(') return false;
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;

        return false;
    }
}
