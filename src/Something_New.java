import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Something_New {
    static  Map<Character, ArrayList<Integer>> map;
    public static void main(String[] ayan) throws Exception {
        System.out.println("<<<<<<<<<<<<<<<<  Vijay is back.  >>>>>>>>>>>>>>>>>>>");
        String s = "abcd";
        String a[] = {"bb"};
        map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(i);
        }
        int count =0;
        for(String p:a){
            if(isCheck(p)) count++;
        }
        System.out.println(count);
    }

    public static boolean isCheck(String s){
        int pre = -1;

        for(char c : s.toCharArray()){
            boolean found = false;
            if(!map.containsKey(c)) return false;
            for(int it : map.get(c)){
                if(it > pre){
                    pre = it;
                    found = true;
                    break;
                }
            }
            if(!found) return  false;
        }
        return true;
    }
}