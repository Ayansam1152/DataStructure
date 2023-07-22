package Striver_Recursion_Series;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {

        int[] a  = {9,8,7,6,8,4,2,3,1};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

        /*
        congrats Dude : you have successfully implement quick sort
         */
    }

    private static void quickSort(int[] a, int l, int r){

        if (l < r) {

            int p = partition(a, l, r);
            quickSort(a,l,p-1);
            quickSort(a, p+1, r);
        }
    }

    private static int partition(int[] a, int l, int r) {
        int pivot = a[r];

        int i = l-1;

        for(int j = l;j<r;j++){
            if(a[j] < pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, r);
        return i+1;
    }

    private static void swap(int[] a, int i, int r) {
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;
    }
}
