package codeChefQuestions;

import java.util.Scanner;

public class LuckeyGame {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            boolean yes3 = false, yes7 = false, not= true;
            while(n>0){
                long a = n%10;
                n= n/10;
                if(a == 3) yes3 = true;
                else if(a==7) yes7 = true;
                else{

                        not = false;
                        break;

                }
            }

            if(not && yes3 && yes7){
                System.out.println("LUCKY");
            }else{
                System.out.println("BETTER LUCK NEXT TIME");
            }
        }
    }
}
