package LCS_and_its_variationDP;

public class Recursion_LongestCommonSubsequence {
    public static void main(String[] args) {
        String s = "vijay", p = "ayiajany";

        System.out.println(LCS(s, p,s.length(), p.length()));
    }

    public static int LCS(String s, String p, int m, int n){
        // first base Condition
        if(m == 0 || n == 0) return 0;

        // choice diagram
        if(s.charAt(m-1) == p.charAt(n-1)){
            return 1+ LCS(s, p, m-1, n-1);
        }else{
            return Math.max(LCS(s,p,m-1, n), LCS(s, p, m, n-1));
        }
    }

}
