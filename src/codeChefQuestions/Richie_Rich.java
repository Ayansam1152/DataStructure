package codeChefQuestions;

import java.util.Scanner;

public class Richie_Rich {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();

            System.out.println((b-a)/x);
        }
    }
}
