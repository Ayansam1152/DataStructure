package CyclicSortAlgoAndQuestions;

import java.util.Arrays;

class findDuplicates {

    public static void main(String[] args) {
        int[] a= {1,1,2};
        System.out.println( findDuplicate(a));
    }
    public static int findDuplicate(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
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