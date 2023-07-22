package codeChefQuestions;

import java.util.Scanner;

public class Hoop_Jump {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {

            long n = sc.nextLong();
            long ans = n/2;
            System.out.println(ans+1);
        }
    }
}
