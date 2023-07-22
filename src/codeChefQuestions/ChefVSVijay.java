package codeChefQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileStore;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChefVSVijay {

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    final static long MOD = 1000000007;
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader fr = new FastReader();

        long q = fr.nextLong();
        while (q-- > 0) {

            long l = fr.nextLong();
            long r = fr.nextLong();

            long c[] = new long[100001];
            long p[] = new long[100001];

            for(int i=1;i<c.length;i++){
                String s =String.valueOf(i);
                long k = i/10;
                StringBuilder sb = new StringBuilder(String.valueOf(k));
                c[i] = Long.parseLong(s+sb.reverse());
            }

            p[1]  = c[1];
            for(int i=2;i<p.length;i++){
                p[i] = p[i-1]+c[i];
            }

            long ans =1;
                ans  = (myPow(c[(int)l],p[(int)r] - p[(int)l])%MOD);

            System.out.println(ans);
        }
    }

    private static long findPower(long n) {
        String numStr = String.valueOf(n);
        long d = numStr.length();
        long sum=0;
        for (long i=0;i<d;i++){
            sum += Long.parseLong(numStr.substring(0,(int)i+1)) * myPow(10,i);
        }
        return sum;
    }

    private static long myPow(long x, long n) {
        long ans =1;
        while(n >0){
            long lastBit = (n&1);
            if(lastBit >0){
                ans = ((ans%MOD)*(x%MOD))%MOD;
            }
            x = ((x%MOD)*(x%MOD))%MOD;
            n = n>>1;
        }
        return ans%MOD;
    }
}
