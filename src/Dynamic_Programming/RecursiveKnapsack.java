package Dynamic_Programming;

public class RecursiveKnapsack {

    static int count =0;
    // it is a zero one knapsack
    public static int knapsack(int[] wt, int[] val, int w, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        count++;
        // here is choice either pick up item or not pick up
        if(wt[n-1] <= w){
            return Math.max(val[n-1]+ knapsack(wt, val, w-wt[n-1],n-1), knapsack(wt, val, w,n-1));
        }
        else if(wt[n-1] > w){
            return knapsack(wt, val, w, n-1);
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] val ={60,100,120};
        int w = 50;
        int n = 3;
        System.out.println(knapsack(wt, val, w, n));
        System.out.println("count "+count);
    }

}
