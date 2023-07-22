import java.util.*;

public class testing_class_Standard_Question {
    public static void main(String[] args) {

        int[] a = {1,1,1,2,2,3};
        String[] s = {"d","b","c","b","c","a"};
        int k=2;

//        int k=2;
//        String s = "leetcode", p = "coding";
//        System.out.print(s.compareTo(p));
//        System.out.println(Arrays.toString(topKFrequent(a, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue((a,b) ->  map.get(a) - map.get(b));

        for (int key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                System.out.print(heap.poll()+" ");

            }
        }

        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll();
        }

        return ans;
    }
    /*
    it's a proud moment
    class Solution {
    public String kthDistinct(String[] s, int k) {
        Map<String , Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length;i++){

            map.put(s[i], map.getOrDefault(s[i],0)+1);

        }
        String ans = "";
        for(String b : map.keySet()){
            if(map.get(b) == 1 && k !=0){
                --k;
                ans = b;
            }
//            System.out.print(b+" ");
        }
        if( k != 0) return "";
        return ans;

    }
}
     */
}
