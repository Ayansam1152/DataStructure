package Striver_Recursion_Series;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] a  = {9,8,7,6,8,4,2,3,1};
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

        /*
        congrats Dude : you have successfully implement merge sort
         */
    }

    private static void mergeSort(int[] a, int l, int r){

        if(l < r){
            int mid = (l+r)>>1;

            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);
            merge(a,l, mid, r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {

        int[] s1 = new int[mid-l+1];
        int[] s2 = new int[r - mid];


        for(int i =0;i<s1.length;i++){
            s1[i] = a[l+i];
        }

        for(int j = 0;j<s2.length;j++){
            s2[j] = a[mid+j+1];
        }

        int p = 0, q = 0, z=l;
        while (p < s1.length && q < s2.length){
            if(s1[p] <= s2[q]){
                a[z] = s1[p++];
            }else if(s1[p] > s2[q]){
                a[z] = s2[q++];
            }
            z++;
        }

        while(p < s1.length){
            a[z++] = s1[p++];
        }

        while (q < s2.length){
            a[z++] = s2[q++];
        }
    }
}
