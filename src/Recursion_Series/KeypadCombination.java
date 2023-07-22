package Recursion_Series;

import java.util.ArrayList;

public class KeypadCombination {
    int val = 8;
    public static void main(String[] args) {
        ArrayList<String> keypad = new ArrayList<>(10);
        keypad.add(".;");
        keypad.add("abc");
        keypad.add("def");
        keypad.add("ghi");
        keypad.add("jkl");
        keypad.add("mno");keypad.add("pqrs");
        keypad.add("tu");keypad.add("vwx");
        keypad.add("yz");

        KeypadCombination obj = new KeypadCombination();
        System.out.println(obj.val);
//        System.out.println(help("77",keypad));
    }

    private  static ArrayList<String>  help(String num, ArrayList<String> keypad){

        if(num.length() == 0){
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return  baseRes;
        }

        char ch = num.charAt(0);
        String restOfString = num.substring(1);
        ArrayList<String> resRes = help(restOfString, keypad); // faith that it will solve

        ArrayList<String> ans = new ArrayList<>();

        String keyString = keypad.get(Integer.parseInt(""+ch));

        for(int i=0;i<keyString.length();i++){
            for(String s : resRes){
                ans.add(keyString.charAt(i)+s);
            }
        }
        return ans;
    }


}



