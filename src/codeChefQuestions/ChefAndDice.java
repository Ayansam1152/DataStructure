package codeChefQuestions;

import java.util.Scanner;

public class ChefAndDice {
    public static void main(String[] ayn) {
        int a[] = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(a);
        System.out.println(ans);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int allsum=0, idx =0;
            for(int j=i;j<arr.length;j++){
                allsum+= arr[j];
                if((idx+1)%2 == 1){
                    sum += allsum;
                }
                idx++;
            }

        }
        return sum;
    }
}
