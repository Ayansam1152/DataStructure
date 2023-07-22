package GoodQuestions;

import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] ayan){
      int a[] = {7,6,4,3,1};

        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] a) {
            int minSoFar = Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<a.length;i++){
                minSoFar = Math.min(a[i], minSoFar);
                maxProfit = Math.max(a[i] - minSoFar, maxProfit);
            }

            return maxProfit;

//        int preMax=0;
//        for(int i=0;i<a.length;i++){
//            int maxProfit= 0;
//            for(int j=i;j<a.length;j++){
//
//                maxProfit = a[j] - a[i];
//                if(maxProfit > preMax){
//                    preMax= maxProfit;
//                }
//
//            }
//        }
//        return preMax;

    }
}
