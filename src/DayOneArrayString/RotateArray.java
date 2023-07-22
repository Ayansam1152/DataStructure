package DayOneArrayString;

class RotateArray {
    public static void main(String[] args) {

    }
    public static void rotate(int[] nums, int k) {
        k = k% nums.length;
        //first we'll rotate all the array
        reverse(nums, 0, nums.length-1);
        // second we'll onlu rotate the first k elemt of the array
        reverse(nums, 0, k-1);
        // now roatate k to n element of the array
        reverse(nums,k, nums.length-1);
        
        
    }
    
    public static void reverse(int[] a , int s, int e){
        while(s < e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            
            s++;
            e--;
        }
    }
}