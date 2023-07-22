package GoodQuestions;

import java.util.Scanner;

public class Leetcode {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-->0){
            long n = sc.nextLong();
            long m = sc.nextLong();

            long x = pow(2,n) -1;
            long ans = pow(x,m);
            System.out.println(ans);
        }
    }

    public static long pow(long x, long n ){
        long mod = 1000000007;
        long temp =1;
        while (n>0){
            if(n%2 ==1){
                temp = ((temp%mod)*(x%mod))%mod;
            }
            x =  ((x*x)%mod);
            n = n/2;
        }

        return temp;
//        if(n==0) return 1;
//
//        int temp= pow(x, n/2);
//
//        if((n&1) == 1) return ((x%mod)*(temp%mod)*(temp%mod))%mod;
//
//        return ((temp%mod)*(temp%mod))%mod;
    }

    public static int maxRemovals(String s, String p, int[] remo){
        int l=0, r = remo.length-1;
        char c[] = s.toCharArray();
        while(l <= r){
            int mid = (l+r)/2;
            for(int i=0;i<=mid;i++){
                c[remo[i]] = '#';
            }

            if(isOk(c, p)) l = mid+1;
            else{
                for(int i=0;i<=mid;i++){
                    c[remo[i]] = s.charAt(remo[i]);
                }
                r = mid-1;
            }
        }
        return l;
    }

    public static boolean isOk(char[] s, String p){
        int i=0,j=0;
        while(i<s.length && j <p.length()){
            if(s[i] == p.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }

        }

        if(j == p.length()) return true;
        return false;
    }
}
