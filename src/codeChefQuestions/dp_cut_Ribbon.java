package codeChefQuestions;

import java.util.Scanner;

public class dp_cut_Ribbon {
    static int a,b,c;
    static int[] dp= new int[4001];
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(help(n));
    }
    public static int help(int n){
        if(n < 0) return -0x3f3f3f3f;
        if(dp[n] !=0 || n==0)return dp[n];
        return dp[n] = 1+ Math.max(help(n-a), Math.max(help(n-b), help(n-c)));
    }
}
