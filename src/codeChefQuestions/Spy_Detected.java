package codeChefQuestions;

import java.util.Scanner;

public class Spy_Detected {
    public static void main(String[] ayn){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while (t-- >0){
           int n = sc.nextInt();
           int a[] = new int[n];
           for(int i=0;i<n;i++){
               a[i] = sc.nextInt();
           }
           for(int i=0;i<n-1;i++){
               for(int j=i+1; j<n;j++){
                   if(a[i] != a[j]){
                       System.out.println(j+1);

                   }
               }

           }


       }

    }
}
