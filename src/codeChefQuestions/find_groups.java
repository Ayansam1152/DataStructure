package codeChefQuestions;

import java.util.Scanner;

public class find_groups {
    public static void main(String[] ayan){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                if(i== s.length()-1 && s.charAt(i)== '1') {
                    count++;
                    continue;
                }
                if(s.charAt(i) == '1' && s.charAt(i+1)=='0'){
                    count++;
                }else{
                    continue;
                }
            }
            System.out.println(count);
        }
    }
}
