package codeChefQuestions;

import java.util.Scanner;

public class PrimeGame {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(l == r && isPrime(l)){
                System.out.println(0);
            }
            else {
                System.out.println(-1);
            }
            int i= l, j =r;
            int first = Integer.MAX_VALUE;
            int second = Integer.MIN_VALUE;
            boolean yes = false, yes1 = false;
            while (i < j){
                if(isPrime(i)){
                    first = Math.min(first,i++);
                    yes = true;
                    break;
                }else {
                    i++;
                }

                if(isPrime(j)){
                    second = Math.max(second, j--);
                    yes1 = true;
                    break;
                }else {
                    j--;
                }
            }
            if(yes && yes1){
                System.out.println(second-first);
            }else if(yes || yes1){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for (int i=2;i<Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;

    }
}
