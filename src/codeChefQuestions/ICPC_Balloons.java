package codeChefQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
           HashMap<Integer,Integer> list = new HashMap<>();
            list.put(1,1);
            list.put(2,2);
            list.put(3,3);
            list.put(4,4);
            list.put(5,5);
            list.put(6,6);
            list.put(7,7);
            for(int i=0;i<n;i++){
                if(list.containsKey(a[i])){
                   list.remove(a[i]);
                }
                if(list.size() == 0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
