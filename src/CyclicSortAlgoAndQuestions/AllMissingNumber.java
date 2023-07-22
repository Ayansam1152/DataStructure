package CyclicSortAlgoAndQuestions;

import java.util.ArrayList;
import java.util.List;

class AllMissingNumber {
    public static void main(String[] args) {

        int[] a = {1,1};
        System.out.println(findDisappearedNumbers(a));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void sort(int[] arr){
        int i=0;

        while(i < arr.length){
            int current = arr[i] -1;
            if(arr[i] != arr[current]){
                swap(arr,i, current);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}