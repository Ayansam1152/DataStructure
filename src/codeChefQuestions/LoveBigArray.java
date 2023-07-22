package codeChefQuestions;


import java.util.Scanner;

public class LoveBigArray {
    public static void main(String[] ayn){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i] <min){
                    min = a[i];
                }
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(a[i] == min) count++;
            }
            System.out.println(Math.abs(n-count));
        }

    }

//    public static int[] sol(int a[] , int n){
//
//    }
}
