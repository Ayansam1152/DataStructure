package codeChefQuestions;

import java.util.Scanner;

public class Pretty_Permutations {

    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++){
                a[i] = i+1;
            }
            int temp = a[n-1];
            for(int i=n-1;i>0;i--){
                a[i] = a[i-1];
            }
            a[0]  = temp;
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}
