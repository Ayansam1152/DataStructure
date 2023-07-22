package codeChefQuestions;

import java.util.Scanner;

public class Maximum_Production {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long g = sc.nextInt();
            long c = sc.nextInt();
            long c2 = c*c;
            System.out.println(c2/(2*g));
        }
    }
}
