package codeChefQuestions;

import java.util.ArrayList;
import java.util.HashMap;


public class Marathon {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
//        Scanner sc= new Scanner(System.in);
//        long t = sc.nextLong();
//        while(t-->0){
//            int D = sc.nextInt();
//            int d = sc.nextInt();
//            long A = sc.nextLong();
//            long B = sc.nextLong();
//            long C = sc.nextLong();
//            int to = D*d;
//            if(to >=10 && to <21){
//                System.out.println(A);
//            }else if(to >= 21 && to <42){
//                System.out.println(B);
//            }else if(to >=42){
//                System.out.println(C);
//            }else{
//                System.out.println(0);
//            }
//        }
        String words[] = {"a","aa","aaa","aaaa"};
        int a[] = {1,2,2,1};
        int b[] = {2,2};
        int ans [] = intersect(a,b);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.getOrDefault(nums1[i], 0)+1);
            }else{
                map.put(nums1[i],1);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                ans.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int a[] = new int[ans.size()];
        for(int i=0;i<a.length;i++){
            a[i]  = ans.get(i);
        }
        return a;
    }
    public static int maxProduct(String[] words) {

        HashMap<Integer,HashMap<Character,Integer>> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            HashMap<Character,Integer> h = new HashMap<>();
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(h.containsKey(c)){
                    h.getOrDefault(c,1);
                }else{
                    h.put(c,1);
                }

            }
            map.put(i,h);
        }
        int max =0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j< words.length;j++){
                HashMap<Character,Integer> h = map.get(j);
                boolean flag = false;
                for(Character c: h.keySet()){
                    if(map.get(i).containsKey(c)){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
