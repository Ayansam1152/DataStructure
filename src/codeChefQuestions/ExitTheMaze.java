package codeChefQuestions;

import java.util.Scanner;

public class ExitTheMaze {
    public static void main(String[] ayn){
        Scanner sc  = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j] = sc.nextInt();
            }
        }
        if(a[0][0] == 1){
            System.out.println("No");
            return;
        }
        int i=0,j=0;
        while(i<6 && j<6){
            if(a[i][j+1]== 1 && a[i+1][j]== 1){
                System.out.println("No");
                break;
            }
        }

    }
}
