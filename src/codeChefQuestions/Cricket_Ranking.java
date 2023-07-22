package codeChefQuestions;

import java.util.Scanner;

public class Cricket_Ranking {
    public static void main(String[] ayn) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r1 = sc.nextInt();
            int w1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int w2 = sc.nextInt();
            int c2 = sc.nextInt();

            int A = 0, B = 0;
            if (r1 > r2) A++;
            else B++;

            if (w1 > w2) A++;
            else B++;

            if (c1 > c2) A++;
            else B++;

            if(A > B){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }

    }

}
