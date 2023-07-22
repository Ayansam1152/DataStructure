package Striver_Recursion_Series;

import java.util.ArrayList;
import java.util.List;

public class combination_Sum {
    public static void main(String[] args) {
        int[] a = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(a,target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> sub=  new ArrayList();
        List<List<Integer>> ds = new ArrayList();

        help(candidates, 0, target, sub, ds);

        return ds;
    }


    private static void help(int[] a, int i, int target, List<Integer> sub, List<List<Integer>> ds){

        if(i == a.length){

            if(target == 0){
                ds.add(new ArrayList(sub));
            }

            return;
        }

        if(a[i] <= target){

            sub.add(a[i]);

            help(a, i, target-a[i], sub, ds);

            sub.remove(sub.size()-1);

        }

        help(a, i+1, target, sub, ds);

    }
}
