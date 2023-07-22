package codeChefQuestions;

import java.util.Scanner;

public class Even_Odds {

    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        double num =  (n/2.0);

        if(k > Math.ceil(num)){
            long ans = (long) (k - Math.ceil(num));
            System.out.println(ans*2);
        }else{
            System.out.println((k*2)-1);
        }
    }
}
