package codeChefQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Golf {
    public static void main(String[] aym) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long t = Long.parseLong(br.readLine());
        while (t-->0){
            String s[] = br.readLine().split(" ");
            long n = Long.parseLong(s[0]);
            long x = Long.parseLong(s[1]);
            long k = Long.parseLong(s[2]);
            HashMap<Long,Long> map = new HashMap<>();
            for(long i=0;i<n+1;i++){
                map.put(i*k, i);
            }
            if(map.containsKey(x)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
