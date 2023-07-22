package codeChefQuestions;

import java.util.Scanner;

public class PalindromeGame {
    public static void main(String[] ayn){

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            String s = sc.next();
            int zero=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '0'){
                    zero++;
                }
            }
            if( zero ==0){
                System.out.println("DRAW");
            }
            if(zero == 2 || zero ==1){
                System.out.println("BOB");
            }else{
                System.out.println("ALICE");
            }


        }
    }
}
