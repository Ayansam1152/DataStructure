package codeChefQuestions;

import java.util.Scanner;

public class Bella_ciao {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-->0){
            long D = sc.nextLong();
            long d = sc.nextLong();
            long p = sc.nextLong();
            long q = sc.nextLong();
            long i=0,c=0,sum=0;

            while(D-->0){
                if(i==d){
                    i=0;
                    c++;
                }
                sum += p+ (c*q);
                i++;
            }
            System.out.println(sum);
        }
    }
}
