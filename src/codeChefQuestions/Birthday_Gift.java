package codeChefQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Birthday_Gift {

    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {

            long n = sc.nextLong();
            long k= sc.nextLong();
            long a[] = new long[(int)n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long i= n-1;
            long s1 =0, s2 =0;
            while(k-->0){
                s1+= a[(int)i];
                s2+= a[(int)i-1];
                i= i-2;
            }
            s2 += a[(int)i];
            System.out.println(s1 >s2? s1:s2);
        }

    }

    public static long helper(long a[] , long n, long k){
        int c = 0, b = 0;
        boolean one = true;
        long i = n - 1;
        long count = 0;
        for (; i >= 0; i--) {
            if (one) {
                c += a[(int) i];
                one = false;
//                sec = true;
            }else{
                b += a[(int) i];
//                sec = false;
                one = true;
            }

            count++;
            if(count == (2*k)) break;

        }
        if(!one){
            c += a[(int) i-1];
        }else{
            b += a[(int) i-1];
        }

        return  Math.max(c, b) ;
    }

    public static long even(long a[],long n, long k){
        int c=0, b=0;
        boolean one = true, sec = false;
        long count = 0;
        for(long i = n-1;i>=0;i--){
            if (one) {
                c += a[(int) i];
                one = false;
//                sec = true;
            }else{
                b += a[(int) i];
//                sec = false;
                one = true;
            }
            count++;
            if(count == (2*k)) break;
        }
        return (Math.max(c,b));
    }
}
