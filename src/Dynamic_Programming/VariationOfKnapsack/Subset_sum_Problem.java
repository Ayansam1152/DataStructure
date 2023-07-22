package Dynamic_Programming.VariationOfKnapsack;

public class Subset_sum_Problem {

    public static void main(String[] args) {

        int[] a = {3,5,7,8,17};
        int sum = 17;
        int n = a.length;

        boolean[][] t = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j]  = true;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j = 1;j<sum+1;j++){
                if(a[i-1] <= j){
                    t[i][j] = t[i-1][j-a[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        System.out.println(t[n][sum]);

    }
}
