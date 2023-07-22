package codeChefQuestions;


import java.util.Scanner;

public class Geometric_Possibility {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int sum=0;
            int maxNumber =0;
            for(int i=0;i<n;i++){
                sum+= a[i];
                maxNumber = Math.max(a[i], maxNumber);
            }
            if((sum - maxNumber) > maxNumber){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
