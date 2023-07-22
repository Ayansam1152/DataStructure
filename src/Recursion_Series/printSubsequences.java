package Recursion_Series;

public class printSubsequences {

    public static void main(String[] args) {
        String q = "abcd";
        printSubSequence(q, "");
    }
    private static void printSubSequence(String ques, String ans){

        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        String restOfQuestion =     ques.substring(1);

        printSubSequence(restOfQuestion, ans+ch);
        printSubSequence(restOfQuestion, ans);
    }
}
