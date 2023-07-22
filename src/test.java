import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String s = "maharashtra";
        int ans =0;
        for(int i=0;i<s.length();i++){
            String a =s.substring(0,i);
            for(int j=i;j<s.length();j++){
                String b = s.substring(i,j);
                ans = Math.max(ans, longCommomAnagramSubseq(a,b,a.length(), b.length()));

            }
        }
        System.out.println(ans+1);
    }

   public static int longCommomAnagramSubseq(String str1,
                                       String str2,
                                       int n1, int n2)
    {

        int []freq1 = new int[26];
        int []freq2 = new int[26];

        for(int i = 0; i < 26; i++)
        {
            freq1[i] = 0;
            freq2[i] = 0;
        }

        int len = 0;

        for (int i = 0; i < n1; i++)
            freq1[(int)str1.charAt(i) - (int)'a']++;

        for (int i = 0; i < n2; i++)
            freq2[(int)str2.charAt(i) - (int)'a']++;

        for (int i = 0; i < 26; i++)
            len += Math.min(freq1[i],
                    freq2[i]);

        return len;
    }
}
