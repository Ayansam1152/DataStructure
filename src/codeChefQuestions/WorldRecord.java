package codeChefQuestions;

import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
import java.io.*;

public class WorldRecord {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            double k1 = sc.nextDouble();
            double k2 = sc.nextDouble();
            double k3 = sc.nextDouble();
            double v = sc.nextDouble();

            double s = k1*k2*k3*v;

            double sec = 100/s;
            double ansSec = Math.round(sec * 100.0)/100.0;

            if(ansSec < 9.58){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
