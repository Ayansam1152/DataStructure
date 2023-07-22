package GoodQuestions;

import java.util.Scanner;

public class MaximumValueOfj_i {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();

        }
        int i=0, j=n-1, max =0;
        int x=Integer.MAX_VALUE, y=0;
        boolean yes = false;
        while(i<j){
            if(a[j] > a[i]){
                max =Math.max( j-i, max);
                x = Math.min(i, x);
                y = Math.max(j, y);
                yes = true;
            }
            j--;
            if(j == i+1){
                j= n-1;
                i++;
            }
        }
        if(yes){
            System.out.println("i = "+x+" j = "+y);
        }else {
            System.out.println("Impossible");
        }
    }
}
