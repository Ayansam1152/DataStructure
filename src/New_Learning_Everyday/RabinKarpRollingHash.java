package New_Learning_Everyday;

public class RabinKarpRollingHash {
    public static void main(String[] args) {
        System.out.println(PrefixWithProperSuffix("pepcoding#gnidocpep"));
    }

    private static String PrefixWithProperSuffix(String s){
        long p = 31;
        long mod  =(long) 1e9+7;
        long pow = 1,prefixHash =0, suffixHash =0;

        long ans =0;

        if(s.length() < 1) return "";
        for(int i=0;i<s.length();i++){
            prefixHash = (prefixHash*p + s.charAt(i)-'a'+1)%mod;
            suffixHash = ((suffixHash + (s.charAt(s.length()-1-i) - 'a'+1)*pow)%mod)%mod;

            pow = (pow*p)%mod;

            if(prefixHash == suffixHash) ans = i+1;
        }
        return s.substring(0, (int)ans);
    }
}
