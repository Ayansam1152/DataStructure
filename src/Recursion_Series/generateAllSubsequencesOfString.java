package Recursion_Series;

import java.util.ArrayList;

public class generateAllSubsequencesOfString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(getSubs(s));
    }

    private static ArrayList<String> getSubs(String s){
        if(s.length() == 0){
            ArrayList<String> basRes = new ArrayList<>();
            basRes.add("");

            return basRes;
        }

        char ch = s.charAt(0);
        String restOfString = s.substring(1);
        ArrayList<String>  recRes = getSubs(restOfString);// faith that it will solve my thought

        ArrayList<String> ans  = new ArrayList<>();
        for(String s1 : recRes){

            ans.add(s1);
            ans.add(ch+s1);
        }

        return  ans;
    }
}
