package codeChefQuestions;

import java.util.Scanner;

public class Xor_Folding {

    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            String[] a = new String[(int)n];
            for(int i=0;i<n;i++){
                a[i] = sc.next();
            }
            long count =0;
            for(String s: a){
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i) =='1') count++;
                }
            }
            if(count%2 ==1 ){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }
    }
}

