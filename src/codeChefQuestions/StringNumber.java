package codeChefQuestions;


import java.util.Collection;
import java.util.Collections;

public class StringNumber {
    public static  void main(String[] ayn){
        System.out.println(sortSentence("is2 sentence4 This1 a3"));

    }

    public static String sortSentence(String s) {

        String a[] = s.split(" ");
        String k ="";
        for(int i=0;i<a.length;i++){
            k = a[i];
            if(i+1 == k.charAt(k.length()-1)){
                continue;
            }else{

                String t = a[i+1];
//                System.out.println(k.charAt(k.length()-1));
                a[i+1] = a[k.charAt(k.length()-1)];
                a[k.charAt(k.length()-1)] =t;

            }
        }

        String ans  = a.toString();
        return ans;
        // for(int i=0;i<a.length;i++){
        //     ans = ans +
        // }
    }
}
