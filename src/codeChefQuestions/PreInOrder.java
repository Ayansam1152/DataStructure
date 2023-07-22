package codeChefQuestions;

import java.util.Scanner;

public class PreInOrder {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ra =(int) Math.ceil(a/xa);
            int rb =(int) Math.ceil(b/xb);
            System.out.println(ra+rb);
        }
    }
}
