package codeChefQuestions;

import java.util.Scanner;

public class Optimal_denomination {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a[] = new long[(int) n];
            long h[] = new long[a.length];
            long f[] = new long[a.length];
            long b[] = new long[a.length];
            long sum =0;
            for(long i=0;i<n;i++){
                a[(int)i] = sc.nextLong();
                sum+= a[(int)i];
            }
            if(a.length ==1){
                System.out.println(0);
            }else{
                f[0] = a[0];
                for(long i=1;i<f.length;i++){
                    f[(int)i] = GCD(f[(int)i-1],a[(int)i]);
                }
                b[b.length-1] = a[a.length-1];
                for(long i=b.length-2;i>=0;i--){
                    b[(int)i] = GCD(b[(int)i+1], a[(int)i]);
                }
                h[0] = b[1];
                h[h.length-1] = f[f.length-2];
                for(long i=1;i<n-1;i++){
                    h[(int)i] = GCD(f[(int)i-1],b[(int)i+1]);
                }

                long min = Long.MAX_VALUE;
                for(long i=0;i<n;i++){
                    long ans = (sum-a[(int)i])/h[(int)i];
                    min = Math.min(min, ans+1);
                }
                System.out.println(min);
            }

        }
    }

    // it's an O(n^2) approach
//    static long findGCD(long arr[], long num){
//        long result = 0;
//        for(long i=0;i<arr.length;i++){
//            if(i != num){
//                result = GCD(result, arr[(int)i]);
//            }
//            if(result == 1) return 1;
//        }
//        return result;
//    }

    public static long GCD(long a, long b){
        if(a==0) return b;
        return GCD(b%a,a);
    }
}
