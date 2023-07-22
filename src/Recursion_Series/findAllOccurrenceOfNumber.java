package Recursion_Series;

import java.util.Arrays;

public class findAllOccurrenceOfNumber {
    public static void main(String[] args) {
        int[] a = {2,2,2,2,2,2,2,3,1,5,7,47,2,3,1,5,7,47,2,3,1,5,7,47};
            System.out.println(Arrays.toString(solve(a,0,3,0)));

    }

    private static int[] solve(int[] a, int i, int num, int foundSoFar){

        if(i == a.length){
            return new int[foundSoFar];
        }

        int[] ans;
        if(a[i] == num){
            ans = solve(a, i + 1, num, foundSoFar + 1);
            ans[foundSoFar] =i;
        }else{
            ans = solve(a, i + 1, num, foundSoFar);
        }
        return  ans;
    }
}
