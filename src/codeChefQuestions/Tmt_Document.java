package codeChefQuestions;


import java.util.ArrayList;

import java.util.Scanner;

public class Tmt_Document {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            if(check(s,n)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
    public static boolean check(String s, int n){
        ArrayList<Integer> T = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'T'){
                T.add(i);
            }else{
                m.add(i);
            }
        }

        if(T.size() != 2* m.size()) return false;

        for(int i=0;i<m.size();i++){
            if(m.get(i) < T.get(i) ||  m.get(i) > T.get(i+m.size())) return false;
        }
        return true;
    }
}
