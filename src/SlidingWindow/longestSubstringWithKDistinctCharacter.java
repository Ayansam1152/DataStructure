package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class longestSubstringWithKDistinctCharacter {
    public static void main(String[] args) {
        String s = "12134";
        System.out.println(longestkSubstr(s,3));
    }

    public static int longestkSubstr(String s, int k) {
        // code here

        Map<Character,Integer> map = new HashMap();

        int ansLen = -1, i=0,j=0;

        while(j < s.length()){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c,0)+1);

            // same 1st increase the window till condition not satisfied
            if(map.size() < k){
                j++;
            }
            // 2nd if condition match then store max window size
            else if( map.size() == k){
                ansLen = Math.max(ansLen, j-i+1);
                j++;
            }
            // last but not least if condition greater, then remove previous element till condition equal or small
            else if( map.size() > k){
                while(map.size() > k){
                    char ith = s.charAt(i);
                    int val = map.get(ith);
                    map.put(ith, val-1);
                    if(map.get(ith) == 0) map.remove(ith);

                    i++;
                }

                j++;
            }
        }
        // and there we go :)
        return ansLen;
    }
}
