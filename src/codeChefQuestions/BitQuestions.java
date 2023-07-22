package codeChefQuestions;

import java.util.Scanner;

public class BitQuestions {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            long ans =0;
            for(int i=1;i<100;i++){
                long po =(long) Math.pow(2,i);
                if(n < po){
                     ans =(long) Math.pow(2,i-1) -1;
                     break;
                }
            }
            System.out.println(ans);
        }
    }
}
