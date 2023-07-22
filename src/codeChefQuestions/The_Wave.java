package codeChefQuestions;

import java.util.Scanner;
import java.util.Set;

public class The_Wave {

    public static void main(String[] ayn) {


        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long q = sc.nextLong();
        long[] a = new long[(int)n];
        long[] b = new long[(int)q];
        for(long i =0;i<n;i++){
            a[(int)i] = sc.nextLong();
        }
        for(long i =0;i<q;i++){
            b[(int)i] = sc.nextLong();
        }

        for(long i=0;i<q;i++){
            long count =0;
            boolean yes = false;
            for(long j=0;j<n;j++){
                if(a[(int)j] == b[(int)i]){
                    yes = true;
                }

                if(a[(int)j] > b[(int)i]){
                    count++;
                }
            }
            if(yes){
                System.out.println(0);
            }
            else if(count %2 ==0){
                System.out.println("POSITIVE");
            }else if(count %2 == 1){
                System.out.println("NEGATIVE");
            }

        }
    }

    public String sortSentence(String s) {

        String a[] = s.split(" ");
        String ans[] = new String[a.length];
        StringBuilder builder = new StringBuilder();
        for(String p: a){
            int i = p.charAt(p.length()-1) -'0';
            ans[i] = p.substring(0,p.length()-1);
        }
        int i=0;
        for (i=0;i<a.length-1;i++){
            builder.append(ans[i]).append(" ");
        }
        builder.append(ans[i]);
        return builder.toString();
    }
}
