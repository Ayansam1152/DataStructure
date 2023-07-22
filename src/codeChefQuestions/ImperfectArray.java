package codeChefQuestions;

import java.util.Scanner;

public class ImperfectArray {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[]  = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int mul= 1;
            for(int i=0;i<n;i++){
                mul = mul* a[i];
            }
            double sqrt = Math.sqrt(mul);
            if(sqrt - Math.floor(sqrt) == 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
