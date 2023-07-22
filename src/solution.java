import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);// :::::::::::my first interview Coding question on live and guss what i just nailed it::::::::::
        /*
        int[] first = {1,2,3,4,5};
        int[] second = {2,3,1,0,5};
        System.out.println(findSecond(second));
        int ans = findMissing(first, second);
        if( ans == -1){
            System.out.println("All elements are present");
        }else {
            System.out.println(ans);
        }
*/
        System.out.println(openingTime(1234));



    }

    public static long openingTime(long N) {

        long  t=1;
        long ans=0;
        while(N >= 0)
        {
            N-=t;
            t*=2;
            ans+=10;
        }
        return ans;
    }

    static int ans = Integer.MIN_VALUE;
    public static int brokenCalc(int startValue, int target) {

        if(startValue > target) return startValue- target;
        help(startValue, target, 0);
        return ans;

    }

    public static void help(int sv, int ta, int op){

        if(sv > ta) return;
        if(sv == ta) {
            ans = Math.min(ans, op);

        }

        help(sv*2, ta, op++);
        help(sv-1, ta, op++);

    }



// 1 2 3 4 5
    // 2 3 1 0 5
    private static int findMissing(int[] first, int[] second){
        for(int i=0;i<first.length;i++){
            boolean isPresent = false;
            for(int j=0;j<second.length;j++){
                if(first[i] == second[j] ){
                    isPresent = true;
                }
            }
            if(!isPresent){
                return first[i];
            }
        }
        return -1;
    }

    //  2,5,3,
    //
    //  4,7,8,9




    private static int findSecond(int [] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }
        }
        return second;
    }
}
