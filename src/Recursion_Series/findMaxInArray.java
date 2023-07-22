package Recursion_Series;

public class findMaxInArray {
    public static void main(String[] args) {
        int[] a = {2,3,1,5,7,47};
        System.out.println(maxUtil(a,0));
    }
    private static int maxUtil(int[] a, int i){
        if(i == a.length) return 0;

        int tempMax = maxUtil(a,i+1);// faith
        if(a[i] > tempMax) return a[i];
        return tempMax;
    }
}
