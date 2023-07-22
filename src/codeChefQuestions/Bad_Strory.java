package codeChefQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Bad_Strory {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n <2) continue;
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(int e : a){
                if(!ans.contains(e)){
                    ans.add(e);
                }

            }

            int i=0, j=i+1;
            boolean yes = true;
            while(i < ans.size() && j < ans.size()){
                if(!ans.contains(Math.abs(ans.get(i) - ans.get(j)))){
                    ans.add(Math.abs(ans.get(i) - ans.get(j)));
                }
                j++;
                if(j == ans.size()){
                    i++;
                    j=i+1;
                }
                if(ans.size() > 300){
                    yes = false;
                    break;
                }
            }
            if(yes){
                System.out.println("YES");
                System.out.println(ans.size());
                for(int e: ans){
                    System.out.print(e+" ");
                }
                System.out.println();
            }else {
                System.out.println("NO");
            }

        }
    }
}
