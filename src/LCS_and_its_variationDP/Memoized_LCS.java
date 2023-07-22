package LCS_and_its_variationDP;

public class Memoized_LCS {
    public static void main(String[] args) {
        String s = "sadhfgbfguyigbjv", p = "apuighaperihvjcvb";
        int[][] t = new int[s.length()+1][p.length()+1];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                t[i][j] = -1;
            }
        }
        System.out.println(solve(s, p, s.length(), p.length(), t));

    }

    public static int solve(String s, String p, int m, int n, int[][] t){

        if(m== 0 || n == 0){
            return 0;
        }
        if(t[m][n] != -1) return t[m][n];
        if(s.charAt(m-1) == p.charAt(n-1)){
            return t[m][n] =  1+ solve(s, p, m-1, n-1, t);
        }else{
            return t[m][n]=  Math.max(solve(s, p, m-1, n,t), solve(s, p, m, n-1,t));
        }
    }
}
