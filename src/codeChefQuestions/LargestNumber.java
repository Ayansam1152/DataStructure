package codeChefQuestions;

import java.util.Arrays;
import java.util.Comparator;


public class LargestNumber {

    public static void main(String[] ayn){
        int a[] = {3,30,34,5,9};
        System.out.println(largest(a));

    }

    private static  class LargestNumberComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            String order1 = o1+o2;
            String order2 = o2+o1;
            return order2.compareTo(order1);
        }
    }

    public static String largest(int n[]){
        String []a = new String[n.length];
        for(int i=0;i<n.length;i++){
            a[i] = String.valueOf(n[i]);
        }

        Arrays.sort(a, new LargestNumberComparator());

        if(a[0].equals("0")) return "0";
        String ans = new String();
        for (String str :a){
            ans += str;
        }
        return ans;
    }

}
