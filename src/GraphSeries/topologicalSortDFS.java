package GraphSeries;

import java.util.ArrayList;
import java.util.List;

public class topologicalSortDFS {
    public static void main(String[] args) {
        int N = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 5,0);
        addEdge(adj, 5,2);
        addEdge(adj, 4,0);
        addEdge(adj, 4,1);
        addEdge(adj, 2,3);
        addEdge(adj, 3,1);
        System.out.println(topoSort(N, adj));
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }


    public static List<Integer> topoSort(int N, List<List<Integer>> adj){
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[N];

        for(int i=0;i<N;i++){
            if(vis[i] == false){
                findTopoSort(i, vis, adj, ans);
            }
        }
        return ans;
    }

    private static void findTopoSort(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> ans) {
        vis[node] = true;

        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                findTopoSort(it,vis,adj,ans);
            }
        }
        ans.add(0,node);
    }

}
