package codeChefQuestions;

import java.util.*;

public class Cyclic_Quadrilateral {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            HashMap<String ,Integer> map = new HashMap<>();
            for(int i=0;i<(n*3);i++){
                String s= sc.next();
                int num = sc.nextInt();
                if(!map.containsKey(s)){
                    map.put(s,num);
                }else{
                    map.put(s,map.getOrDefault(s,1)+num);
                }
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(Map.Entry<String,Integer> it : map.entrySet()){
                ans.add(it.getValue());
            }
             Collections.sort(ans);
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
    }
}
