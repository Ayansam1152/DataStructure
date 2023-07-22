package codeChefQuestions;

import java.util.Scanner;

public class Review_site {

    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            int up =0, down =0;
            for(int i=0;i<a.length;i++){
                if(a[i] == 1){
                    up++;
                }else if(a[i] == 2){
                    down++;
                }else{
                    up++;
                }
            }
            if(up > down){
               System.out.println(up);
            }else{
               System.out.println(0);
            }

        }
    }
}
