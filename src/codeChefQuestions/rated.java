package codeChefQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class rated {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int num = sc.nextInt();
        while (true && num >=0){
            list.add(num);
            num = sc.nextInt();
        }


        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }

}
