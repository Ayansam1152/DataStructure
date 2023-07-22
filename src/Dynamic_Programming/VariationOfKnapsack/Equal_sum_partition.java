package Dynamic_Programming.VariationOfKnapsack;

public class Equal_sum_partition {
    // this problem is equivalent to subset problem
    // let's see how we do that
    // 1. if sum of all the element is even then only we can find equal sum partition
    //otherwise not && we have to find half of sum only
    public static void main(String[] args) {
        int[] a = {3, 4, 7, 8,2,3,1,1};
        System.out.println(isEqualSumPartition(a));

    }

    public static boolean isEqualSumPartition(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+= a[i];
        }
        if(sum %2 != 0) return false;

        int findSum = sum/2;
        int n = a.length;

        boolean[][] t = new boolean[n+1][findSum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<findSum+1;j++){
                if(i == 0){
                    t[i][j] = false;
                }

                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<findSum+1;j++){
                if(a[i-1] <= j){
                    t[i][j] = t[i-1][j-a[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][findSum];
    }

}
