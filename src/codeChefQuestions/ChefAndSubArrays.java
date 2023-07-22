package codeChefQuestions;

import java.util.Scanner;

public class ChefAndSubArrays {
    public static void main(String[] ayn){
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            long n = sc.nextLong();
//            long k = sc.nextLong();
//            long a[] = new long[(int)n];
//            for(int i=0;i<n;i++){
//                a[i]  = sc.nextLong();
//            }
//            if(n== k){
//                System.out.println(0);
//                return;
//            }

        char c = 'H'+32;
        System.out.println(toLowerCase("Ayan"));

    }
    public static String toLowerCase(String s) {

        String st ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c <97){
//                char b = 'H'+32;
                char ch = (char) (c+32);
                st+=ch;
            }else{
                st+=c;
            }
        }
        return st;

    }
}
