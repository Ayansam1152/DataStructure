package GoodQuestions;

import java.util.ArrayList;
import java.util.List;

public class Longest_common_prefix {
    public static void main(String[] ayn){
//        String[] a= {"flower","flow","flight"};
//        System.out.println(longestCommonPrefix(a));

        MedianFinder mf = new MedianFinder();
        mf.addNum(6);
        System.out.println(mf.findMedian());
        mf.addNum(10);
        System.out.println(mf.findMedian());
        mf.addNum(2);
        System.out.println(mf.findMedian());
        mf.addNum(6);
        System.out.println(mf.findMedian());
        mf.addNum(5);
        System.out.println(mf.findMedian());
        mf.addNum(0);
        System.out.println(mf.findMedian());
        System.out.println(mf.list);

    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length ==1) return strs[0];
        int j=1;
        String ans="";

        while(true){
            for(int i=1;i<strs.length;i++){
                System.out.print(strs[i].substring(0,j)+" "+ strs[i-1].substring(0,j)+" ");
                if(strs[i].substring(0,j) != strs[i-1].substring(0,j)){

                    return ans;
                }
            }
            ans = ans+strs[0].substring(0,j+1);
            j++;
        }


    }
    static class MedianFinder {

        List<Double> list;
        int odd_Even_checker;


        /** initialize your data structure here. */
        public MedianFinder() {
            list = new ArrayList();
            odd_Even_checker =0;

        }

        public void addNum(int num) {
            odd_Even_checker++;
            list.add((double)num);

        }

        public double findMedian() {

            if(odd_Even_checker%2 ==0){
                double index = list.size()/2;
//                System.out.println((list.get((int)index)+list.get((int)index-1))/2);
                return (list.get((int)index)+list.get((int)index-1))/2;
            }else{
//                System.out.println((list.size()/2));
                return list.get((list.size()/2));
            }

        }
    }
}
