package codeChefQuestions;

import java.util.Scanner;

public class Odd_set {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[2*n];
            int even =0, odd=0;
            for(int i=0;i<a.length;i++){
                a[i] = sc.nextInt();
                if(a[i]%2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(even == n && odd == n){
                System.out.println("Yes");
            }else{
                System.out.println("No");

            }
        }

    }
}
