package DayOneArrayString;

import java.util.Arrays;

class SquareOfSortedArray {

    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
    public static int[] sortedSquares(int[] nums) {
        
        int res[] = new int[nums.length];
        
        int i=0, j = res.length-1;
        for(int k=nums.length-1;k>=0;k--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[k] = nums[i]*nums[i];
                i++;
            }else{
                res[k] = nums[j]*nums[j];
                j--;
            }
        }
        return res;
    }
}