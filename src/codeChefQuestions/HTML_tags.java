package codeChefQuestions;

import java.util.Scanner;

public class HTML_tags {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if(s.length() <=3 || !s.startsWith("</") || s.charAt(s.length()-1) != '>'){
                System.out.println("Error");
                continue;
            }
                boolean yes = true;
            for(int i=2;i<s.length()-1;i++){
                int c = s.charAt(i);
                if(!((c >= 48 && c <= 57) || (c>=97 && c<=122))){
                    yes = false;
                }
            }
            if(yes){
                System.out.println("Success");
            }else{
                System.out.println("Error");
            }

        }
    }
}
