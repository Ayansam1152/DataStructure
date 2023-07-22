package codeChefQuestions;

import java.util.Scanner;

public class PrimeCount {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean a[] = new boolean[(int)n+1];
        int count=0;
        a[0] = true;
        a[1] = true;
       for(int i=2;i*i<=n;i++){
           if(!a[i]){

               for(int j=2;j*i<=n;j++){
                   a[i*j] = true;
               }
           }
       }

       for(int i=2;i<=n;i++ ){
           if(!a[i]) count++;
       }
       System.out.println(count);
    }
}
