package DayOneArrayString;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] a = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(a)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]  = help(nums,i); 
        }
        
        return ans;
    }
    
    public static int help(int[] arr, int pos){
        
        int i= arr.length%(pos+1);
        
        while(i != pos){
            if(arr[i] > arr[pos]){
                return arr[i];
            }
            i = arr.length%(i+1);
        }
        return -1;
    }
}