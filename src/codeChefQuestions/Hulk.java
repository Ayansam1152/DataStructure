package codeChefQuestions;

import com.sun.source.tree.UsesTree;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Hulk {

    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "I ";
        String ans = "";
        int i=1;
        while (n-- !=1){
            if(i%2 != 0){
                ans+= s+"hate "+"that ";
            }else {
                ans += s+"love "+"that ";
            }
            i++;
        }
        if(i%2 != 0){
            ans+= s+"hate "+"it";
        }else {
            ans += s+"love "+"it";
        }
        System.out.println(ans);
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.contains(2);
        Set<Integer> set = new HashSet();
        for(int p :set){

        }
    }

}
