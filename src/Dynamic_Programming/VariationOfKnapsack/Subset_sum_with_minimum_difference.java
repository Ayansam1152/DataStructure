package Dynamic_Programming.VariationOfKnapsack;

import java.util.ArrayList;
import java.util.List;

public class Subset_sum_with_minimum_difference {
    public static void main(String[] args) {
        int[] a = {1,6,11,5};
        int range =0;
        for(int i=0;i<a.length;i++){
            range+= a[i];
        }
        List<Integer> subsetSum = subsetSum(a);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<subsetSum.size();i++){
            min = Math.min(min, range- 2*subsetSum.get(i));
//            System.out.print(subsetSum.get(i)+" ");
        }

        System.out.println("Minimum difference is : "+min);
    }

    private static List<Integer> subsetSum(int[] a){

        int n = a.length;
        int range =0;
        for(int i=0;i<n;i++){
            range+= a[i];
        }

        boolean[][] t = new boolean[n+1][range+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<range+1;j++){
                if(i == 0) {
                    t[i][j] = false;
                }

                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j =0;j<range+1;j++){
                if(a[i-1] <= j){
                    t[i][j] = t[i-1][j-a[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        ArrayList<Integer> subsetArray = new ArrayList<>();
        for(int j=1;j<(range+1)/2;j++){
            if(t[n][j]){
                subsetArray.add(j);
            }

        }
        return subsetArray;
    }

}
