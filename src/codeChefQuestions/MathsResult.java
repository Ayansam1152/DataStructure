package codeChefQuestions;

import java.util.Scanner;

public class MathsResult {
    public static void main(String[] ayn){

        System.out.println(checkZeroOnes("1111000"));
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long a[] = new long[(int)n];
//        for(int i=0;i<n;i++){
//            a[i] = sc.nextLong();
//        }
//        if(n>1){
//            long f = a[0], num=Integer.MIN_VALUE;
//            for(int i=1;i<n;i++){
//                if(a[i] > num) num = a[i];
//            }
//            for(int i=0;i<n;i++){
//                if(num >= a[i] ){
//                    a[i] = num;
//                }
//            }
//            for(int i=0;i<n;i++){
//                System.out.print(a[i]+" ");
//            }
//        }else{
//            System.out.println(a[0]);
//        }
    }

    public static boolean checkZeroOnes(String s) {

        int oneC =0, preOne =0, preZero =0, zeroC=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                preOne++;
                oneC = Math.max(preOne, oneC);

            }else{
                preOne =0;
            }

            if(s.charAt(i) == '0'){
                preZero++;
                zeroC = Math.max(zeroC, preZero);

            }else{
                preZero =0;
            }
        }


       return oneC > zeroC;

    }
}
