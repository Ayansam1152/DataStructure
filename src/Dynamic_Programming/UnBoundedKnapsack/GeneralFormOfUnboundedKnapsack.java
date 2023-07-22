package Dynamic_Programming.UnBoundedKnapsack;

public class GeneralFormOfUnboundedKnapsack {

    public static int unBoundedKnapsack(int[] wt){
        int n =0, w =0;
        int[] val = new int[n];
        int[][] t = new int[n+1][w+1];

        // this is for init
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i ==0 || j ==0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1]+t[i][j-wt[i-1]], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][w];
    }
}
