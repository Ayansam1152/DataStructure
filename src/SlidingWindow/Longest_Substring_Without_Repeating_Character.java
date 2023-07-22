package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Character {

    // such the proudest things you have done Really :)
    public int lengthOfLongestSubstring(String s) {
        /*
        // nice solution but
        if(s.length() <= 1) return s.length();

        int ansLen =0, i=0, j=0;

        Set<Character> set = new HashSet();

        while(j < s.length()){
            char c = s.charAt(j);
            // if the duplicate character come then remove till that character
            if(set.add(c)){
                j++;
            }else{

                char removeChar = s.charAt(i++);
                set.remove(removeChar);
                // set.remove(removeChar);
                while (removeChar != c) {

                    removeChar = s.charAt(i);
                    set.remove(removeChar);
                    i++;
                }
                // but add current character
                set.add(c);
            }
            j++;
            // calculate window each time and store the maximum len
            ansLen = Math.max(ansLen, j-i);
        }
        return ansLen;

         */

        Map<Character,Integer> map = new HashMap();

        int ansLen = -1, i=0,j=0;

        while(j < s.length()){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c,0)+1);

            // same 1st increase the window till condition not satisfied
//            if(map.size() < k){
//                j++;
//            }
            // 2nd if condition match then store max window size
             if( map.size() == j-i+1){
                ansLen = Math.max(ansLen, j-i+1);
                j++;
            }
            // last but not least if condition greater, then remove previous element till condition equal or small
            else if( map.size() < j-i+1){
                while(map.size() < j-i+1){
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
