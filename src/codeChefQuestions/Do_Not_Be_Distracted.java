package codeChefQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Do_Not_Be_Distracted {

    public static boolean cheks(String s, int n){
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int diff = i- map.get(c);
                if(diff >1){
                    return false;
                }else{
                    map.put(c, i);
                }

            }else{
                map.put(c,i);
            }
        }
        return true;
    }

    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            if(cheks(s, n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
