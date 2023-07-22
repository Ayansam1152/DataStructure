package codeChefQuestions;

import java.util.Scanner;

public class virusOutBreak {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        String v = sc.next();
        int n = sc.nextInt();
        while(n-->0){
            String b = sc.next();
            int i=0,j=0;
            while(i< v.length() && j <b.length()){
                if(v.charAt(i)== b.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            if(j == b.length()){
                System.out.println("POSITIVE");
            }else {
                System.out.println("NEGATIVE");
            }
        }
    }

}
