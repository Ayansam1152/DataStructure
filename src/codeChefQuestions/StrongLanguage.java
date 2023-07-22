package codeChefQuestions;

import java.util.Scanner;

public class StrongLanguage {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k= sc.nextInt();
            String s = sc.next();
           int maxLen=0;
           int len=0;
           for(int i=0;i<n;i++){
               char ch = s.charAt(i);
               if(ch =='*'){
                   len++;
               }else{
                   len=0;
               }

               if(maxLen <len) maxLen = len;
           }
           if(maxLen >= k){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
        }
    }
}
