package codeChefQuestions;

import java.util.Scanner;

public class RatingGame {
    public static void main(String[] ayan){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<3;i++){
            b[i] = sc.nextInt();
        }
        int count1=0;
        int count2 =0;
        for(int i=0;i<3;i++){
            if(a[i] >b[i]){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.print(count1+" "+count2);

    }
}
