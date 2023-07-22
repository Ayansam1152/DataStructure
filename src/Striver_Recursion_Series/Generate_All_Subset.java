package Striver_Recursion_Series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generate_All_Subset {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(subsets(a));
    }

    // 1.this is one type of recursion for generating of all the sequences
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans  = new ArrayList();

        List<Integer> sub =  new ArrayList();
        help(nums, 0, sub, ans);

        return ans;

    }

    private static void help(int[] a, int i, List<Integer> sub, List<List<Integer>> ans){

        if( i == a.length){
            ans.add(new ArrayList(sub));

            return;
        }

        // pick the current element
        sub.add(a[i]);
        help(a, i+1, sub, ans);

        // not pick the current element
        sub.remove(sub.size()-1);
        help(a, i+1, sub, ans);
    }

    // 2. type of recursion
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> sub = new ArrayList();
        List<List<Integer>> ans = new ArrayList();

        helper(nums, 0, sub, ans);

        return ans;

    }

    private void helper(int[] a, int ind, List<Integer> sub, List<List<Integer>> ans){


        ans.add(new ArrayList(sub));


        for(int i= ind;i<a.length;i++){

            if(i != ind && a[i] == a[i-1]) continue;

            sub.add(a[i]);
            help(a, i+1,sub, ans);
            sub.remove(sub.size()-1);
        }



    }
        /*
        // non optimized solution
        Set<List<Integer>> ans  = new HashSet();
        Arrays.sort(nums);
        List<Integer> sub =  new ArrayList();
        help(nums, 0, sub, ans);

        List<List<Integer>> res = ans.stream().collect(Collectors.toList());

        return res;
    }

    private void help(int[] a, int i, List<Integer> sub, Set<List<Integer>> ans){

        if( i == a.length){
            // List<Integer> res = new ArrayList(sub);
            // Collections.sort(res);
            ans.add(new ArrayList(sub));

            return;
        }

        // pick the current element
        sub.add(a[i]);
        help(a, i+1, sub, ans);

        // not pick the current element
        sub.remove(sub.size()-1);
        help(a, i+1, sub, ans);
    }
    */
}
