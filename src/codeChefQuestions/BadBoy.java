package codeChefQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class BadBoy {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a[] = new long[(int)n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            if( n==2){
                System.out.println(a[0]+" "+a[1]);
                continue;
            }
            long pos =-1,mn = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(mn > (a[i] - a[i-1])){
                     mn = (a[i] - a[i-1]);
                    pos = i;
                }
            }
            for(long i=pos;i<n;i++){
                System.out.print(a[(int)i]+" ");
            }
            for(int i=0;i<pos;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
