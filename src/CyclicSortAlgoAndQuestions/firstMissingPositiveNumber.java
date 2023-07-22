package CyclicSortAlgoAndQuestions;

class firstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,6};
        System.out.println(firstMissingPositive(a));
    }

    public static int firstMissingPositive(int[] nums) {
        sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }

    public static void sort(int[] arr){
        int i=0;

        while(i < arr.length){
            int current = arr[i] -1;
            if(arr[i]>0 && arr[i] < arr.length && arr[i] != arr[current]){
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