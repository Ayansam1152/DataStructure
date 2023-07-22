package SlidingWindow;

public class slidingWindowVariableSize {

    public static void main(String[] args) {
        int[] a = {1,4,1,1,1,2,3,0,0,0,2};
        System.out.println(largestSubArraySum(a, 5));
    }

    private static int largestSubArraySum(int[] a, int sum){
        int maxLength = Integer.MIN_VALUE;
        int i=0, j=0, sumSoFar =0;

        while(j < a.length){
            sumSoFar += a[j];
            // 1st condition if sum is not match then increase window
            if(sumSoFar < sum) j++;
            // 2nd condition is sum is match then store window size
            else if(sumSoFar == sum){
                if(j-i+1 > maxLength) maxLength = j-i+1;
                j++;
            }

            else if(sumSoFar > sum){
                while(sumSoFar > sum){
                    sumSoFar-= a[i];
                    i++;
                }
                j++;
            }
        }
        return maxLength;
    }
}
