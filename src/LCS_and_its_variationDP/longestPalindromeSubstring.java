package LCS_and_its_variationDP;

public class longestPalindromeSubstring {
    class Solution {
        public String longestPalindrome(String s) {
         /*
          String p = "";
        for(int i=0;i<s.length();i++){
            p = s.charAt(i)+p;
        }
        int m = s.length(), n = p.length();
        int[][] t = new int[m+1][n+1];
        return LCS(s, p, m ,n, t );


        int i=m, j = n;
        String ans  = "";
        while(i >0 && j >0){

            if(s.charAt(i-1) == p.charAt(j-1)){
                ans = s.charAt(i-1)+ans;
                i--;
                j--;
            }else{

                if(t[i-1][j] >= t[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        return ans;
        */
            int max = 0;
            String res = "";

            for(int i=0;i< s.length();i++){

                // for odd center palindrome
                int l =i, r =i;
                res = maxPaliSubs(s, l, r, max, res);

                max = res.length();
                // for even center palindrome
                l = i; r = i+1;

                res = maxPaliSubs(s, l, r, max, res);
            }

            return res;


        }

        private String maxPaliSubs(String s, int l, int r, int max, String ans){


            while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){

                if(r-l+1 > max){
                    max = r-l+1;
                    ans = s.substring(l, r+1);
                }
                l--;
                r++;
            }
            return ans;
        }

    /*
    public String LCS(String s, String p, int m, int n , int[][] t){


        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i ==0 || j ==0) t[i][j] =0;
            }
        }

        String ans = "";
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){

                if(s.charAt(i-1) == p.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                    ans  += s.charAt(i-1);
                    System.out.print(ans+ " ");
                }else{
                    t[i][j] = 0;
                }
            }
        }
        return ans;
    }*/
    }
}
