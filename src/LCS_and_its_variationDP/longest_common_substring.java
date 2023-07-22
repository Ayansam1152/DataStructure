package LCS_and_its_variationDP;

public class longest_common_substring {
    public static void main(String[] args) {
        String s = "ABCABC", p = "ABC";
//        System.out.println(LCSUtil(s, p, s.length(), p.length()));
        int m = s.length(), n = p.length();

        int[][] t= new int[m+1][n+1];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if( i ==0 || j == 0) t[i][j] = 0;
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(s.charAt(i-1) == p.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                    ans = Math.max(ans, t[i][j]);
                }else{
                    t[i][j] = 0;

                }
            }
        }
        System.out.println(ans);
    }

    public static int LCSUtil(String s, String p, int m, int n){
        if(m == 0 || n == 0) return 0;

        if(s.charAt(m-1) == p.charAt(n-1)) {
            return 1 + LCSUtil(s, p, m - 1, n - 1);
        }else{
            return 0;
        }
    }
}
