package codeChefQuestions;

import java.util.Scanner;

public class Laze_Chef {
    public static void main(String[] ayn)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int lazy = x*m;
            int maxDelay = x+d;
            System.out.println(Math.min(lazy,maxDelay));
        }
    }
}
