package codeChefQuestions;

import java.util.Scanner;

public class fuel_Mountains {
    public static void main(String[] ayn) {


    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int max_so_far = a[0];
        int sum =0;
        for(int i=0;i<n;i++){
            sum += a[i];
            if(sum > max_so_far){
                max_so_far = sum;
            }
            if(sum <0){
                sum =0;
            }
        }
        System.out.println(max_so_far);
    }
}
}
