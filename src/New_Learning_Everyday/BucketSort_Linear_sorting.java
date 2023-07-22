package New_Learning_Everyday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketSort_Linear_sorting {

    class Solution {
        public String frequencySort(String s) {

            if(s.length() < 0)return s;

            // putting all element and it's frequency into the map
            Map<Character, Integer> map = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            // making a bucket list type
            List<Character>[] bucketList = new List[s.length()+1];

            // putting char in the frequency index in list
            for(Character key : map.keySet()){
                int frq = map.get(key);
                if(bucketList[frq] == null){
                    bucketList[frq] = new ArrayList();
                }
                bucketList[frq].add(key);
            }

            StringBuilder ans = new StringBuilder();
// according to need travers the list
            // for higher frequency traverse from last and vice - versa
            for(int i=bucketList.length-1;i>=0;i--){
                if(bucketList[i] !=null){
                    for(char c : bucketList[i]){

                        for(int j=0;j<map.get(c);j++){
                            ans.append(c);
                        }

                    }
                }
            }
            return ans.toString();


        /*

         this is O(nLogn) solution using map and priorityQueue

        Map<Character, Integer> map = new  HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }



        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue()-a.getValue());

        pq.addAll(map.entrySet());

        StringBuilder ans = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry e = pq.poll();

            for(int i=0;i<(int)e.getValue();i++){
                ans.append(e.getKey());
            }
        }
        return ans.toString();

        */
        }
    }
}
