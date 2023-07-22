import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class infosys {
    public static void main(String[] args) {
//        int[][] a = {{10,6},{2,8},{1,6},{7,12}};
        int[] a = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(a,5,a.length);
        System.out.println(Arrays.toString(a));


    }

    public static int help(int n, List<Integer> arr){
        int[] a  = new int[n];
        int mod = (int)1e9+7;
        for(int i=0;i<n;i++){
            a[i] = arr.get(i);
        }
         if(n == 1) return a[0];
        int max = Integer.MIN_VALUE,maxInd = -1, min = Integer.MAX_VALUE, minInd = -1;
        for(int i=0;i<n;i++){

            if(max<= a[i]){
                max = a[i];
                maxInd = i;
            }
            if(min >= a[i]){
                min = a[i];
                minInd = i;
            }

        }

        if(maxInd == 0 || maxInd == n-1){
            a[minInd] = max;
            a[maxInd] = min;
        }

        if(n == 1) return a[0];
        while (n != 1){
            for(int i=0;i<n-1;i++){

                a[i] = (((a[i])%mod)+((a[i+1])%mod))%mod;
            }
            n--;
        }
        return a[0]%mod;

    }

    public static int helper(int[] a, int i, int size, int sum, int k){
        if(size == k){
            size=0;
            return sum;
        }

        int opt1 = helper(a, i+1,size++, sum, k);
        int opt2 = helper(a, i+1,size, sum, k);

        return  sum;

    }
}
