package codeChefQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search_Suggestion_System {
    public static void main(String[] ayn){
        String []a = {"mobile","mouse","moneypot","monitor","mousepad"};
//        suggestedProducts(a, "mouse");
        System.out.println(suggestedProducts(a,"mouse"));
    }

    public static List<List<String>> suggestedProducts(String[] p, String s) {

        Arrays.sort(p);
        ArrayList<List<String>> ans = new ArrayList<>();
       for(int i=0;i<s.length();i++){
           ArrayList<String> list = new ArrayList<>();
           int count=0;
           for(int j=0;j<p.length;j++){
               String str = p[j];
               if(i <p.length && str.substring(0,i+1).equals(s.substring(0,i+1))){
                   list.add(str);
                   count++;
                   if(count == 3){
                       count =0;
                       break;
                   }
               }
           }
           ans.add(list);

       }

        return ans;
    }


}
