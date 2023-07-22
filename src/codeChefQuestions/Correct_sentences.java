package codeChefQuestions;

import java.util.Scanner;

public class Correct_sentences {
    public static void main(String[] ayn)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            int k= sc.nextInt();
            String a[] = new String[k];
            for(int i=0;i<k;i++){
                a[i] = sc.next();
            }
            boolean yes = true;
            for(int i=0;i<k;i++){
                yes = true;
                if(!check(a[i])) {
                    yes = false;
                    break;
                }
            }
            if(yes) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String s){

            if(s.charAt(0) >='a' && s.charAt(0) <='m'){
                for(int j=1;j<s.length();j++){
                    if((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) > 'm' && s.charAt(j) <= 'z')) return false;
                }
                return true;
            }else if(s.charAt(0) >= 'N' && s.charAt(0) <= 'Z'){
                for(int j=1;j<s.length();j++){
                    if((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) < 'N') ) return false;
                }
                return true;
            }else{
                return false;
            }

        }

    }

