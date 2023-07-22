package codeChefQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Unplease_ones {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a[] = new long[(int)n];
//            long b[] = new long[(int)n];
//            int even =0 ,odd =0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();

            }

            ArrayList<Long> ans =new ArrayList<>();
            for (int i=0;i<n;i++){
                long num = a[i];
                if(num%2 ==0){
                    ans.add(0,num);
                }else{
                    ans.add(num);
                }
            }
            for (int i=0;i<n;i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
    }
}
