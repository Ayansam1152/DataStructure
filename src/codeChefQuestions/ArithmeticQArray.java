package codeChefQuestions;

import java.util.Scanner;

public class ArithmeticQArray {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum+= a[i];
            }

            if(sum == n){
                System.out.println(0);
            }else if(sum > n){
                System.out.println(sum-n);
            }else{
                System.out.println(1);
            }
        }
    }
}
