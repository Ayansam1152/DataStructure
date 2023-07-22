package codeChefQuestions;

import java.util.Scanner;

public class dp_flipping_game {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a[] = new long[(int)n];
        long c1=0, count=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
            c1+= a[i];
            if(a[i] ==1){
                a[i] = -1;
            }else{
                a[i] =1;
            }
        }
        if(c1 == a.length-1){
            System.out.println(c1-1);

        }
        long max =0, ans=0;
        for(int i=0;i<n;i++){
            max = Math.max(0, a[i]+max);
            ans = Math.max(ans, max);
        }
        System.out.println(ans+c1);
    }
}
