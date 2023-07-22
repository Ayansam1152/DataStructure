package SlidingWindow;

public class max_Sum_Size_K {
    public static void main(String[] args) {
        int[] a= {100,200,300,400};
        System.out.println(check("aba",0, 2));
    }

    private static boolean check(String s, int st ,int e){

        if(st >= e) return true;

        if(s.charAt(st) != s.charAt(e)) return false;
        return check(s, st+1, e-1);
    }

    private static int slidingWindow(int[] a, int k){
        // basically what i am trying to achieve

        int ans = Integer.MIN_VALUE;
        int res =0, i=0, sum=0, j=0;
        //
        for(int p=0;p<k;p++){
            res = res+a[p];
        }
        int cur_sum = res;

        for(int p=k;p<a.length;p++){
            cur_sum += a[p] - a[p-k];
            res = Math.max(res, cur_sum);
        }
        return res;
        //

//        while(j < a.length){
//
//            //if(j-i+1 < k){
//                sum+= a[j];
//            //}
//             if(j-i+1 == k){
//                ans = Math.max(ans, sum);
//                System.out.println("sum"+sum);
//            }
//            else if(j-i+1 > k){
//
//                while(j-i+1 > k){
//                    sum-= a[i];
//                    i++;
//                }
//            }
//            j++;
//        }
//        return ans;
    }
}
