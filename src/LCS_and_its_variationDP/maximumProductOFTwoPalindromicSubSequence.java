package LCS_and_its_variationDP;

public class maximumProductOFTwoPalindromicSubSequence {

    class Solution {
        public int maxProduct(String s) {

            int ans = 0;
            int n  = s.length();

            for(int i=0;i<(1<<n);i++){
                String p= "", q = "";
                for(int j = 0;j<n;j++){
                    if((i &(1<<j)) != 0 ) p += s.charAt(j);
                    else q+= s.charAt(j);
                }
                int m1 = palindrome(p);
                int m2 = palindrome(q);

                ans = Math.max(ans, m1*m2);
            }
            return ans;

        }

        private int palindrome(String s){
            String  p ="";
            for(int i = s.length()-1;i>=0;i--){
                p += s.charAt(i);
            }
            int[][] t = new int[s.length()+1][p.length()+1];
            return LCS(t, s, p, s.length(), p.length());
        }

        private int LCS(int[][] t, String s, String p, int m, int n){
            for(int i=0;i<m+1;i++){
                for(int j=0;j<n+1;j++){

                    if(i == 0 || j == 0) t[i][j] = 0;
                    else if(s.charAt(i-1) ==  p.charAt(j-1) ) t[i][j] = 1+t[i-1][j-1];
                    else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
            return t[m][n];
        }
    }
}
