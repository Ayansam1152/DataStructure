package codeChefQuestions;

import java.util.Scanner;

public class false_number {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){


            String s = sc.next();

            if(s.charAt(0) == '1'){
                System.out.println(s.substring(0,1)+"0"+s.substring(1));
            }else{
                System.out.println("1"+s);
            }
        }
    }
}
