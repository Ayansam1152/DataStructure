package Dynamic_Programming;

public class Top_Down_DP_Knapsack {

    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] val ={25,75,15,95,80,40,35};
        int w = 48;
        int n = 3;
        int[][] t = new int[n+1][w+1];

        // recursive base case convert into initilisation of top down DP
        for(int i=0;i<n+1;i++){
            for(int j= 0;j<w+1;j++){
                if(i == 0 || j  == 0){
                    t[i][j] = 0;
                }
            }
        }
        // and rest recursive call become iterative let's see
        // i stand for item and j for weight
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);

                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        System.out.println(t[n][w]);
    }
}
