package codeChefQuestions;

import java.sql.SQLOutput;
import java.util.*;

public class validPair {
    static int a = 5, b = 3, c = 2;
    static int[] dp = new int[4001];

    public static void main(String[] ayn) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//         while(t-->0){
//             long a = sc.nextLong();
//             long b = sc.nextLong();
//             long x =0;
//             if( a== b){
//                 System.out.println(0);
//                 continue;
//             }else if( a> b){
//                 x = a-1;
//             }else{
//                 x = b-1;
//             }
//             double p =(double) (b-x)/2, q = (double) (x-a)/2;
//
//             System.out.println((long) (Math.ceil(p)+Math.ceil(q)));
//             long  min = Math.min(a,b), max = Math.max(a,b);
//
//             long sum=0;
//             if (x != b) {
//                 x = x + 1;
//             }


//             long hi= (long)Math.pow(2, n) -1;
//
//             if(k <= hi/2){
//                 long ans =hi*k;
//                 System.out.println(ans*2);
//             }else{
//                 k =(int) hi/2 +1;
//                 long ans =hi*k;
//                 System.out.println(ans*2);
//             }
//             long lo =0;

//             while(k-- >0 && (lo < hi)){
//                 long res = hi^lo;
//                 ans += res*2;
//                 lo++;
//                 hi--;
//             }

//             int count=0;
//             while(a !=0){
//                 count++;
//
//                 a = (int)Math.floor(a/b);
//             }
//            System.out.println((count));
//             if(a+b  < 3){
//                 System.out.println(1);
//             }else if(a+b >= 3 &&  a+b <=10 ){
//                 System.out.println(2);
//             }else if(a+b >= 11 &&  a+b <=60 ){
//                 System.out.println(3);
//             }else {
//                 System.out.println(4);
//             }
        System.out.println(partition("aab"));

         }

//        int c = sc.nextInt();
//        if(a == b || b== c || a == c){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        int a[] = {1,2,5};
//        System.out.println(grayCode(2));
//        int g[] = {2,2};
//        int h[] = new int[g.length];
//        for(int i=0;i<h.length;i++){
//            h[i] = (int) findGCD(g,i);
//        }
//        for (int e:h){
//            System.out.print(e+" ");
//        }
//        int a[] = {-2,0,1,1,2};

//        System.out.println(getLucky("hvmhoasabaymnmsd", 1));

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList();
        List<String> curr = new ArrayList();
        partition(0, s, curr, ans);
        return ans;
    }

    public static void partition(int index, String s, List<String> curr, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList(curr));
            return;
        }

        for(int i= index;i<s.length();i++){
            if(isPalindrome(s.substring(index,i+1))){
                System.out.println(s.substring(index,i+1));
                curr.add(s.substring(index, i+1));
                partition(i+1, s, curr, ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int start = 0, end = s.length()-1;
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }


    public static int getLucky(String s, int k) {

        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = 1 + (s.charAt(i) - 'a');
            sum += c % 9 == 0 ? 9 : c % 9;
            // System.out.print(c%9 == 0?9:c%9 +" "+c);

        }
        System.out.println(s.length() + " ");

        if (k == 1) {
            return (int) sum;
        } else {
            return (int) (sum % 9 == 0 ? 9 : sum % 9);
        }

    }





    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        // edge case
        if(nums.length <3){
            return list;
        }

        Arrays.sort(nums);
        int k= nums.length-1;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(i!=j && j != k){

                    if(0 - nums[i] < nums[j]+nums[k]){
                        k--;
                    }

                    else if((0 - nums[i])==(nums[j]+nums[k])){

                        Integer a[] = {nums[i], nums[j], nums[k]};
                        Arrays.sort(a);

                        List<Integer> ans = Arrays.asList(a);
                        System.out.println(ans);
                        if(!list.contains(ans)){
                            list.add(ans);
                        }

                    }
                }

            }
        }
        return list;
    }

    public static int findLength(int[] a, int[] b) {
        int max =0, count=0;
        int i=0, j=0;
        while(i <a.length && j <b.length){
            count=0;
            if(a[i] == b[j]){
                int k = i+1;
                j++;
                count++;
                while(k <a.length && j < b.length){
                    if(a[k++] == b[j++]){
                        count++;
                    }else{
                        break;
                    }

                }
            }else{
                j++;
            }
            max = Math.max(max, count);
            if(j >= b.length){
                i++;
                j=0;
            }
        }
        return Math.max(max, count);
    }

    static long findGCD(int[] arr, long num){
        long result = 0;
        for(int i=0;i<arr.length;i++){
            if(i != num){
                result = GCD(result, arr[i]);
            }
            if(result == 1) return 1;
        }
        return result;
    }

    public static long GCD(long a, long b){
        if(a==0) return b;
        return GCD(b%a,a);
    }


     static List<String> list;
    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList();
        list= new ArrayList<>();
        list.add("0");
        list.add("1");
        List<String> s = helpers(n);

        for(int i=0;i<s.size();i++){
            ans.add( Integer.parseInt(s.get(i),2));
        }
        return ans;
    }

    public static List<String>  helpers(int n){
        if( n== 1){
            return list;
        }

        List<String> s = helpers(n-1);

        for(int i=0;i< s.size();i++){
            s.set(i,"0"+s.get(i));
        }

        for(int i= s.size()-1;i>=0;i--){
            s.add("1"+s.get(i));
        }

        return s;
    }


    public static int help(int n){
        if(n < 0) return -0x3f3f3f3f;
        if(dp[n] !=0 || n==0)return dp[n];
//        if(n ==0) return 0;
//        int opt1 = help(n-a);
//        int opt2 = help(n-b);
//        int opt3 = help(n-c);
        return dp[n] = 1+ Math.max(help(n-a), Math.max(help(n-b), help(n-c)));
    }
    public static int helper(int amount, int[] coins){
        if(amount ==0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount >= coins[i]){
                int opt = 1+helper(amount-coins[i], coins);
                ans = Math.min(opt, ans);
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
    public static String removeOccurrences(String s, String part) {
        int i = s.indexOf(part);
        while(i !=-1){
            int partLen = part.length();
            s = s.substring(0,i)+s.substring(i+partLen);
            i = s.indexOf(part);
        }
        return s;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList();
        PriorityQueue<Pair> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            if(pq.size() <k){
                pq.add(new Pair(arr[i], Math.abs(arr[i]-x)));
            }else{
                if(pq.peek().gap > Math.abs(arr[i]-x)){
                    pq.remove();
                    pq.add(new Pair(arr[i], Math.abs(arr[i]-x)));
                }
            }
        }

        for(Pair p : pq){
            ans.add(p.val);
        }
        Collections.sort(ans);
        return ans;
    }
}


    class Pair implements Comparable<Pair>{
        int val;
        int gap;
        Pair(){};
        Pair(int val, int gap){
            this.val = val;
            this.gap = gap;
        }

        public int compareTo(Pair o){
            if(this.gap == o.gap){
                return this.val - o.val;
            }else{
                return this.gap - o.gap;
            }
        }
    }

