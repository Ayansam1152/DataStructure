package CyclicSortAlgoAndQuestions;

import java.util.Arrays;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {0};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return  nums.length;
    }

    public static void sort(int[] arr){
        int i=0;

        while(i < arr.length){
            int current = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[current]){
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
