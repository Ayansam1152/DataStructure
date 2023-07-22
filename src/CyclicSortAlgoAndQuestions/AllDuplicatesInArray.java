package CyclicSortAlgoAndQuestions;

import java.util.ArrayList;
import java.util.List;

class AllDuplicatesInArray {

    public static void main(String[] args) {

    }

    public static List<Integer> findDuplicates(int[] nums) {
        
    sort(nums);
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
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