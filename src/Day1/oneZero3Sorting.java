package Day1;

import java.util.Scanner;


public class oneZero3Sorting {
    public static void main(String[] ayan){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        // brute force Approach
//        int zeroCount=0;
//        int oneCount=0;
//        int twoCount=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i] == 1) oneCount++;
//            if(a[i] == 0) zeroCount++;
//            if(a[i] ==2 ) twoCount++;
//        }
//        for(int i=0;i<zeroCount;i++){
//            a[i] = 0;
//        }
//        for(int i= zeroCount; i<zeroCount+oneCount;i++){
//            a[i]= 1;
//        }
//        for(int i=zeroCount+oneCount;i<a.length;i++){
//            a[i] = 2;
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(a[i] +" ");
//        }

        // 2nd Approach
        // the best approach for this
        int low=0, mid =0, high= a.length-1;
        while(mid <= high){
            if(a[mid] == 0){
               int temp = a[mid];
               a[mid]= a[low];
               a[low]= temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else if(a[mid] == 2){
               int temp = a[mid];
               a[mid] = a[high];
               a[high]= temp;
                high--;
            }
        }
        for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
        }

    }

}
