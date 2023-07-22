package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class missing_RepeatingNum {
    public static void main(String[] ayan){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int repeat=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                repeat=a[i];
                continue;
            }
            sum+= a[i];
        }
        int missing  = (n*(n+1)/2) - sum;
        System.out.println("Repeating element is = "+ repeat+ "\n"+" Missing is "+ missing );
    }
}
