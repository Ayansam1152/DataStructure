import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FastInputOutputClass {


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] ayn) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long a[] = new long[(int)n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            Map<Long, Long> map = new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(a[i])){
                    map.put(a[i], map.getOrDefault(a[i],0l)+1l);
                }else{
                    map.put(a[i],1l);
                }

            }
            int size = a.length;
            long ans =0l;
            for(int i=0;i< n;i++){
                ans += size - map.get(a[i]);
            }
            System.out.println(ans);
        }
    }

}
