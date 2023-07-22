package Dynamic_Programming.VariationOfKnapsack;

public class Count_Subset_sum_ofGiven_Diff {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,0,0,0,1};
        int diff = 1;
        int arrSum =0;
        for(int i=0;i<a.length;i++){
            arrSum+= a[i];
        }
        System.out.println(arrSum);
        int sum = (diff + arrSum)/2;
        System.out.println(CountSubsetSum(a,sum));
    }

    private static int CountSubsetSum(int[] a,int sum){
        int n = a.length;
        int[][] t = new int[n+1][sum+1];

        for(int j =0;j<sum+1;j++){
            t[0][j] = 0;
        }

        for(int i=0;i<n+1;i++){
            t[i][0] = 1;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(a[i-1] <= j){
                    t[i][j] = t[i-1][j-a[i-1]] + t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
