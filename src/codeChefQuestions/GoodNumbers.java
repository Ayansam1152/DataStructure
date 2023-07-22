package codeChefQuestions;

import java.util.Scanner;

public class GoodNumbers {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if( a== b || b== 1){
                System.out.println("NO");
                return;
            }
            long z = a*b;
            long d = a*z;
            long y = d - a;
            long x = a;
            System.out.println("YES");
            System.out.print(x+" "+y+" "+d);
            System.out.println();
        }
    }
}
