package Dynamic_Programming;


public class MemoizedKnapsack {
    static int count =0;
    public static int knapsack(int[] wt, int[] val, int w, int n, int[][] t){
        if(n == 0 || w == 0){
            return 0;
        }
        count++;
        if(t[n][w] != -1) return t[n][w];
        // here is choice either pick up item or not pick up
        if(wt[n-1] <= w){
            return t[n][w] =  Math.max(val[n-1]+ knapsack(wt, val, w-wt[n-1],n-1,t), knapsack(wt, val, w,n-1,t));
        }
        else if(wt[n-1] > w){
            return t[n][w] =knapsack(wt, val, w, n-1, t);
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] val ={60,100,120};
        int w = 50;
        int n = 3;
        int[][] t = new int[n+1][w+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                t[i][j] = -1;
            }
        }
        System.out.println(knapsack(wt, val, 50, n, t));
        System.out.println("count - "+count);
    }
}
