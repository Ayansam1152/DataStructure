import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringEncodingAndDecoding {

    public static String encoding(String s){

        char[] a = s.toCharArray();
        String ans ="";
        for(int i=0;i<a.length;i++){
            if(Character.isDigit(a[i])){
                return "INVALID INPUT";
            }
            if(Character.isAlphabetic(a[i])){
                ans += (char)(a[i]+5);
            }else {
                ans+= a[i];
            }
        }
        return ans;
    }

    public static String decoding(String s){
        char[] a = s.toCharArray();
        String ans = "";
        for(int i=0;i<a.length;i++){

            if(Character.isDigit(a[i]) && !Character.isLetter(a[i])){
                return "INVALID INPUT";
            }

            if(Character.isAlphabetic(a[i])){
                ans += (char)(a[i]-5);
            }else{
                ans+= a[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        System.out.println(list);
        list.remove(new Character('b'));
        System.out.println(list);


//        String s = "Vijay Pal";
//        System.out.println(encoding("Hello , Sir"));
//        System.out.println(decoding("sjjiytyfqp"));
//        int[] a = {5,1,4,3,6,8,10,7,9};
//        System.out.println(f(a));
//
//        String  ans = "";
//        Node temp = head;
//5265
//        while(temp != null){
//            ans+= temp.val;
//            temp = temp.next;
//        }


    }




    static int f(int[] a) {

        // let's try to optimize it

        int leftMax = a[0], rightMin = a[a.length - 1];
        int p = 1, q = a.length - 2;
        while (p <a.length && q >=0) {
            if (leftMax == rightMin) return p;

            leftMax = Math.max(leftMax, a[p]);
            rightMin = Math.min(rightMin, a[q]);

            p++;
            q--;
        }
        return -1;

    }



/*
        if(a.length <=2) return -1;
        int[] l = new int[a.length];
        int[] r = new int[a.length];
        l[0] = a[0];
        r[r.length-1] = a[a.length-1];

        for(int i=1;i<l.length;i++){
            l[i] = Math.max(l[i-1], a[i]);
        }

        for(int i = r.length-2;i>=0;i--){
            r[i] = Math.min(r[i+1], a[i]);
        }


        for(int i=0;i<a.length;i++){
            if(l[i] == r[i]){
                return i;
            }
        }
        return -1;
    }

 */

    // another good question

    class Solution {
        public int[] findOriginalArray(int[] c) {

            if(c.length  %2 != 0) return new int[]{};

            // Set<Integer> set = new HashSet();
            Arrays.sort(c);

            int[] ans = new int[c.length /2];

            Map<Integer, Integer> map  = new HashMap();

            for(int i=0;i<c.length;i++){

                if(!map.containsKey(c[i])){
                    map.put(c[i], 1);
                }else{
                    map.put(c[i], map.getOrDefault(c[i], 0)+1);
                }
            }
            int j=0;
            for(int i=0;i<c.length;i++){
                if(map.get(c[i]) != 0){
                    map.put(c[i], map.getOrDefault(c[i], 1)-1);
                    ans[j++] = c[i];

                    if(map.containsKey(c[i]*2) && map.get(c[i]*2) !=0){
                        map.put(c[i]*2, map.getOrDefault(c[i]*2, 1)-1);
                    }else{
                        return new int[0];
                    }
                }
                System.out.print("I :"+i);
            }
            return ans;
        }
    }
}
