import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum_Two {
    public static void main(String[] args) {

        /*
        questions is this
        Input: candidates = [10,1,2,7,6,1,5], target = 8
        Output:
        [
        [1,1,6],
        [1,2,5],
        [1,7],
        [2,6]
        ]
         */

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<Integer> sub = new ArrayList();
        List<List<Integer>> ds  = new ArrayList();

        help(candidates, 0, target,sub,ds);

        return ds;


    }

    private static void  help(int[] a, int i, int target,List<Integer> sub, List<List<Integer>> ds){

        if(i == a.length){
            if(target == 0){
                ds.add(new ArrayList(sub));

            }
            return;
        }

        if(a[i] <= target){

            for(int j = i;j<a.length;j++){
                if(j != i && a[j] == a[j-1]) continue;

                sub.add(a[j]);

                help(a, j+1,target-a[j], sub, ds);

                sub.remove(sub.size()-1);

            }

        }else{

            help(a, i+1, target, sub, ds);
        }
    }
}
