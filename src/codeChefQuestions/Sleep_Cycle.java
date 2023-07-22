package codeChefQuestions;

import java.util.Scanner;
import java.util.Stack;

public class Sleep_Cycle {
    public static void main(String[] ayn) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
//        Scanner sc = new Scanner(System.in);
//        long t = sc.nextLong();
//        while (t-- > 0) {
//            long l = sc.nextLong();
//            long h = sc.nextLong();
//            String s = sc.next();
//            int count=0;
//            for(int i=0;i<l;i++){
//                if(s.charAt(i) !='1'){
//                    count++;
//                }else{
//                    if(count != 0){
//                        h = (h-count)*2;
//                        count=0;
//                    }
//
//                }
//            }
//            if(count >= h){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
//        }
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(stack.isEmpty() || stack.peek()!= c){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        String ans="";
        while (!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        return ans;
    }

}
