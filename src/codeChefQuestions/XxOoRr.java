package codeChefQuestions;

import java.util.Scanner;

public class XxOoRr {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long a[] = new long[(int)n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long b[] = new long[33];
            for(int i=0;i<n;i++){
                int j=b.length-1;
                long num = a[i];
                while (num !=0){
                    b[j--] += num%2;
                    num = num/2;
                }
            }
            int ans =0;
            for(int i=0;i<b.length;i++){
               if(b[i]%k ==0){
                   ans+= b[i]/k;
               }else{
                   ans+= (b[i]/k)+1;
               }
            }
            System.out.println(ans);
        }
    }
}
