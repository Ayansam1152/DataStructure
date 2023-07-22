package codeChefQuestions;

import java.util.Scanner;

public class Ordinary_Number {

    public static long count(long n){
        if(n <10) return n;
        if(n <=100){
            long sum=0;
            for(long i=11;i<n;i=i+11){
                sum++;
            }
            return 9+sum;
        }
        if(n <=1000){
            long sum=0;
            for(long i=111;i<n;i=i+111){
                sum++;
            }
            return 18+sum;
        }
        if(n <=10000){
            long sum=0;
            for(long i=1111;i<n;i=i+1111){
                sum++;
            }
            return 27+sum;
        }
        if(n <=100000){
            long sum=0;
            for(long i=11111;i<n;i=i+11111){
                sum++;
            }
            return 36+sum;
        }

        if(n <=1000000){
            long sum=0;
            for(long i=111111;i<n;i=i+111111){
                sum++;
            }
            return 45+sum;
        }
        if(n <=10000000){
            long sum=0;
            for(long i=1111111;i<n;i=i+1111111){
                sum++;
            }
            return 54+sum;
        }
        if(n <= 100000000){
            long sum=0;
            for(long i=11111111;i<n;i=i+11111111){
                sum++;
            }
            return 63+sum;
        }

        if(n <=1000000000){
            long sum=0;
            for(long i=111111111;i<n;i=i+111111111){
                sum++;
            }
            return 72+sum;
        }
        return 0;
    }
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(count(n));
        }
    }
}
