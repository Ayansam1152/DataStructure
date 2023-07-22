package Binary_Search;

import java.util.Scanner;

public class Bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(findPos(a,key));
    }

    private static int findPos(int[] a, int key){
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (a[mid] == key) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
