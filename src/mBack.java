import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mBack {
    public static void main(String[] ayan) throws Exception {
        System.out.println("<<<<<<<<<<<<<<<<  Vijay is back.  >>>>>>>>>>>>>>>>>>>");


//        AESSecurity aes = new AESSecurity();
//        String ans = "I Love Ayan Where are you now i am finding you please C";
//        String enc = aes.encrypt(ans);
//        System.out.println(enc);
//        System.out.println(aes.decrypt(enc));

//        int a[] = {1,2,3,0,0,0};
//        int b[] = {2,5,6};
//        merge(a,3,b,3);
//        for(int i:a){
//            System.out.print(i);
//        }
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(minDistance("leetcode", "etco"));
        int a[] ={1,3,5,4,7};
        System.out.println(findNumberOfLIS(a));

    }

    public static int findNumberOfLIS(int[] nums) {
        int []lis = new int[nums.length];
        int []count = new int[nums.length];
        Arrays.fill(lis, 1);
        Arrays.fill(count,1);
        int max =0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j] && lis[i] < lis[j]+1) {
                    lis[i] = lis[j]+1;
                    count[i] = count[j];
                }
                else if(nums[i] > nums[j] && lis[i] == (lis[j]+1)) {
                    count[i] += count[j];
                }

            }
            max = Math.max(max,lis[i]);
        }



        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(max == lis[i]){
                ans+= count[i];

            }
        }
        return ans;
    }

    public static int minDistance(String w1, String w2) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: w1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c,0) + 1);
            }else{
                map.put(c,1);
            }
        }

        int count=0;
        for(char c: w2.toCharArray()){
            if(!map.containsKey(c)){
                count++;
            }else{
                if(map.get(c) >1){
                    map.put(c,map.get(c)-1);
                }else{
                    map.remove(c);
                }
            }

        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            count+= entry.getValue();
        }

        return count;
    }
    // abcabc

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count=0, j=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ' ') c= '*';
            if(map.containsKey(c)){
                if(count <j){
                    count =j;

                }
                j=0;
                map.clear();
            }
            map.put(c,i);
            j++;
        }
    return count >j?count:j;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1, k=m+n-1;

        while(i>=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while( j >=0){
            nums1[k--] = nums2[j--];
        }

    }
}
