package codeChefQuestions;

import java.util.Arrays;

import java.util.Scanner;

public class fair_playoff {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a[] = new int[4];
            for(int i=0;i<4;i++){
                a[i] = sc.nextInt();
            }
            int max1 =Math.max(a[0], a[1]);
            int max2 =Math.max(a[2],a[3]);
            Arrays.sort(a);
            int m1 =a[3], m2 = a[2];

            if((max1 == m1 || max1 == m2) && (max2 == m1 || max2 == m2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
