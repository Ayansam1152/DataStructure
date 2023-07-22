package codeChefQuestions;

public class binarySearch {
    public static void main(String[] ayn){
        int a[]= {2,5};
        System.out.println(search(a,2));
    }
    public static int search(int[] nums, int target) {

        if(nums.length ==1 ){
            return target == nums[0]?0:-1;
        }
        int lo=0,hi=nums.length-1;
        while(lo < hi){
            int mid = lo+(hi - lo)/2;
            if(target == nums[mid]) {
                return mid;
            }
            else if(target < nums[mid]){
                hi = mid-1;
            }else{
                lo = mid;
            }
        }

        return -1;
//        int lo=0,hi=nums.length-1;
//        while(lo < hi){
//            int mid = (lo+hi)>>1;
//            if(target < nums[mid]){
//                hi = mid-1;
//            }else{
//                lo = mid;
//            }
//        }
//
//        return nums[lo] == target?lo:-1;

    }

    public static  int find(int a[], int l, int r, int t){
        if(l>r) return -1;
        int mid = (l+r)>>1;
        if(a[mid] == t) {
            return mid;
        }

        if(t < a[mid]){
            return find(a,l,mid-1,t); // exclude mid
        }else{
           return  find(a, mid, r,t); // include mid
        }

    }
}
