package Dynamic_Programming.VariationOfKnapsack;

public class count_Subset_sum {
    public static void main(String[] args) {
        int[] a = {3,5,2,8,10,5,5};
        int sum =10;
        System.out.println(countSubsetSum(a, sum));
    }

    public static int countSubsetSum(int []a, int sum){
        int n = a.length;
        int[][] t = new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i == 0) {
                    t[i][j] = 0;
                }

                if(j ==0 ){
                    t[i][j] = 1;
                }
            }
        }

        for(int i =1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(a[i-1] <= j){
                    t[i][j] = t[i-1][j -a[i-1]] +t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
