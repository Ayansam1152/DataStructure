package codeChefQuestions;

import java.util.Scanner;

public class Solubility {
    public static void main(String[] ayan){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         while(t-->0){
             int x = sc.nextInt();
             int a = sc.nextInt();
             int b = sc.nextInt();
             int ans = a + (100-x)*b;
             System.out.println(ans*10);
         }
    }
}
