package GraphSeries;

import java.util.List;

public class CycleInDirectedGraphDFS {
    public boolean isCycle(int V, List<List<Integer>> adj){
        boolean[] vis = new boolean[V];
        boolean[] dfsVis = new boolean[V];

        for(int i=0;i<V;i++){
            if(vis[i] == false){
                if(checkCycle(i, adj, vis, dfsVis)) return true;
            }
        }
        return false;
    }

    private boolean checkCycle(int node, List<List<Integer>> adj, boolean[] vis, boolean[] dfsVis) {
        vis[node] = true;
        dfsVis[node] = true;

        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                if(checkCycle(it, adj, vis, dfsVis)) return true;
            }else if(dfsVis[it]) return true;
        }
        dfsVis[node] = false;
        return false;
    }
}
