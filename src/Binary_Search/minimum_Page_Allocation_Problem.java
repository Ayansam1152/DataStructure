package Binary_Search;

public class minimum_Page_Allocation_Problem {
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        /*Your code here
        N = number of pages
        M = number of students
         */

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0;i<N;i++){
            min = Math.min(min, A[i]);
            sum+= A[i];
        }

        int lo =min, hi = sum;
        int res = -1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;

            if(isPossible(mid, A, N, M)){
                hi = mid-1;
                res = mid;
            }else{
                lo = mid+1;
            }
        }

        return res;
    }

    private static boolean isPossible(int barrier,int[] a, int n, int stu){
        int maxStu = 1, pages = 0;

        for(int i=0;i<n;i++){
            if(a[i] > barrier) return false;

            if(a[i] + pages > barrier){
                maxStu++;
                pages = a[i];
            }else{
                pages+=a[i];
            }
        }
        if(maxStu > stu) return false;
        return true;

    }
}
