package codeChefQuestions;

public class BuddyString {
    public static void main(String[] ayn){
//        if(buddyStrings("aa", "aa")) {
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
        StringBuilder sb = new StringBuilder("aa");
        if(! sb.reverse().toString().equals("aa")){
            System.out.println(true);
        }
    }

    public static boolean buddyStrings(String a, String b) {

        int i=0, j=0;
        boolean notEqual = false;
        String s= "";
        while(i<a.length() && j <b.length()){
            char ah = a.charAt(i);
            char bh = b.charAt(j);
            if(ah  != bh){
                notEqual = true;
                s+= bh;
            }else{
                s+= ah;
            }
            i++;
            j++;
        }
        if(!notEqual){
            StringBuilder sb = new StringBuilder(a);
            if(sb.reverse().toString() != b) return false;
            return true;
        }
        return true;
    }

}
