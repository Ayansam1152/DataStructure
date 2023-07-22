package GraphSeries;


import java.util.ArrayList;

public class cycleDetectionUsingDFS {
    public static boolean DFSCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        for(int i=1;i<=V;i++){
            if(vis[i] == false){
                if(isCycle(i, vis,adj, -1)) return true;
            }
        }
        return false;
    }

    private static boolean isCycle(int start, boolean[] vis, ArrayList<ArrayList<Integer>> adj, int par) {
        vis[start]  = true;
        for(Integer it : adj.get(start)){
            if(vis[it] == false){
                isCycle(it, vis, adj, start);
            }
            else if(it != par) return true;
        }
        return false;
    }
}
