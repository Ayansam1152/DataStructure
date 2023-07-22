package codeChefQuestions;

import java.util.Scanner;

public class dp_Boredom {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count[] = new long[100001];
        long dp[] = new long[100001];
        for(int i=0;i<n;i++){
            long num = sc.nextInt();
            count[(int)num]++;
        }
        dp[0] =0;
        dp[1] = count[1];
        for(int i=2;i<=100000;i++){
            dp[i] = Math.max(dp[i-1],  dp[i-2]+count[i]*i);
        }
        System.out.println(dp[100000]);
    }
}
