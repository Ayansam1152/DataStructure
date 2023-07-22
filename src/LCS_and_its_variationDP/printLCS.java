package LCS_and_its_variationDP;

public class printLCS {
    public static void main(String[] args) {
        String s = "leetcodecom", p = "mocedocteel";
        int m= s.length(), n = p.length();
        int[][] t = new int[m+1][n+1];
        LCS(s, p, m, n, t);
        int i = m , j = n;
        String ans = "";
        while(i > 0 && j  > 0){
            if(s.charAt(i-1) == p.charAt(j-1)){
                ans = s.charAt(i-1)+ans;
                i--;
                j--;
            }else{
                if(t[i-1][j] > t[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        System.out.println(ans);

    }

    public  static void LCS(String s,String p, int m, int n, int[][]t){
        // base convert to initiliasation
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if( i ==0 || j == 0) t[i][j] = 0;
            }
        }


        for(int i=1;i<m+1;i++){
            for(int j =1;j<n+1;j++){

                if(s.charAt(i-1) == p.charAt(j-1)){
                    t[i][j] = 1+ t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
    }

}

/*
this is anwy and only for testsing
package LCS_and_its_variationDP;

public class printLCS {
    public static void main(String[] args) {
        String s = "leetcodecom", p = "mocedocteel";
        int m= s.length(), n = p.length();
        int[][] t = new int[m+1][n+1];
        LCS(s, p, m, n, t);
//        int i = m , j = n;
//        String ans = "";
//        System.out.print(t[m][n]);
        int max = t[m][n], ans =1;
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(t[i][j] == max ){
                    ans++;
                }
            }
        }
        System.out.print(max*ans);
//        while(i > 0 && j  > 0){
//            if(s.charAt(i-1) == p.charAt(j-1)){
//                ans = s.charAt(i-1)+ans;
//                i--;
//                j--;
//            }else{
//                if(t[i-1][j] > t[i][j-1]){
//                    i--;
//                }else{
//                    j--;
//                }
//            }
//        }
//        System.out.println(ans);

    }

    public  static void LCS(String s,String p, int m, int n, int[][]t){
        // base convert to initiliasation
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if( i ==0 || j == 0) t[i][j] = 0;
            }
        }


        for(int i=1;i<m+1;i++){
            for(int j =1;j<n+1;j++){

                if(s.charAt(i-1) == p.charAt(j-1)){
                    t[i][j] = 1+ t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
    }

}

 */
