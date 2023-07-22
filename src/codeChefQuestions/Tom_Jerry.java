package codeChefQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tom_Jerry {
    public static void main(String[] ayn) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long t = Long.parseLong(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            String z[] = s.split(" ");
            long a = Long.parseLong(z[0]);
            long b = Long.parseLong(z[1]);
            long c =Long.parseLong(z[2]);
            long d = Long.parseLong(z[3]);
            long k = Long.parseLong(z[4]);

           long x = Math.abs(a-c)+ Math.abs(b-d);
           if(x > k){
               System.out.println("NO");
           }else if(x == k){
               System.out.println("YES");
           }else if((k-x)%2 == 0){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
        }
    }
}
