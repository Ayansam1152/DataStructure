package codeChefQuestions;

import java.util.Scanner;

public class chefLuckyDraw {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            int k = sc.nextInt();



            int sum1 =0;
            int sum2=0;
            for(int i=0;i<s1.length();i++){
                int ch = s1.charAt(i);
                sum1+= ch;

            }
            for(int i=0;i<s2.length();i++){
                int ch = s2.charAt(i);
                sum2+= ch;
            }

            if(sum1 == sum2 && Math.abs(sum1- sum2)<=3){
                System.out.println("WIN");
            }else {
                System.out.println("LOSE");
            }
        }
    }
}
