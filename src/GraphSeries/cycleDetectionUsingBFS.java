package GraphSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class cycleDetectionUsingBFS {
    static class Node{
        int first;
        int second;
        Node(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);

        for(int i=0;i<=V;i++){
            if(vis[i] == false){
                if(checkForCycle(adj,i, vis)) return true;
            }
        }
        return false;
    }

    private static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int start, boolean[] vis) {

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(start, -1));
        vis[start] = true;

        while(!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            for(Integer it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(new Node(it, node));
                }
                else  if(par != it) return true;
            }
        }
        return false;
    }
}
