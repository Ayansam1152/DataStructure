package Recursion_Series;

public class firstAppearOfNumber {
    public static void main(String[] args) {
        int[] a = {2,3,1,5,7,47};
        System.out.println(firstAppearance(a,0,47));
    }

    private static int firstAppearance(int[] a,int i, int num){
        if( i == a.length) return -1;

        if(a[i] == num) return i;
        return firstAppearance(a, i+1,num);
    }
}
