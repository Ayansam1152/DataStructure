package codeChefQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class No_time_to_wait {
    public static void main(String[] ayan){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int reqSum = x +a[n-1];
        if(reqSum >= h){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
