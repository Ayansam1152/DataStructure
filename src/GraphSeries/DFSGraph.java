package GraphSeries;

import java.util.ArrayList;

public class DFSGraph {

    public static void main(String[] args) {
        int n = 10;
        int[][] edges = {{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}};
        System.out.println(validPath(n, edges,5,9));
    }

    public static ArrayList<Integer> DfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> storeDfs = new ArrayList<>();
        boolean[] vis = new boolean[V+1];
        for(int i=0;i<V;i++){
            if(vis[i] == false){
                dfs(i, vis, adj, storeDfs);
            }
        }
        return  storeDfs;
    }

    private static void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs) {
        storeDfs.add(i);
        vis[i] = true;

        for (Integer it : adj.get(i)){
            if(vis[i] == false){
                dfs(it,vis, adj, storeDfs);
            }
        }
    }

    // <<<<< it's one variation is bipartite graph you should have to solve it by yourself using dfs>>>.



    // it is a simple question for path finding

    public static boolean validPath(int n, int[][] edges, int start, int end) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e: edges){
            addEdge(adj, e[0], e[1]);
        }
        boolean[] vis = new boolean[n];

        return def(start, adj, vis, end);


    }

    public static boolean def(int start, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int end){
        if(start == end) return true;
        vis[start] = true;

        for(int it : adj.get(start)){
            if(vis[it] == false){
                // if(it == end) return true;
                boolean path = def(it, adj, vis, end);
                if(path == true) return true;
            }
        }

        return false;

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


}
