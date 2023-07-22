package codeChefQuestions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] ayn){
        int a[] = {1,4,2,3,5,5,6,2,3,2};
        System.out.println(findKthLargest(a, 4));
    }

    public static int findKthLargest(int[] nums, int k) {

        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums) {
            pq.offer(val);

            if(pq.size() > k) {

                System.out.print(pq.poll()+" ");
            }
        }
        return pq.peek();
    }

    public static boolean checkValidString(String s) {
        int ob=0,cb=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') ob++; cb++;
            if(ch == ')') cb--; ob--;
            if(ch == '*') ob--; cb++;

            if(ob <0) ob=0;
            if(cb <0) return false;
        }
        return ob == 0;


    }
}

