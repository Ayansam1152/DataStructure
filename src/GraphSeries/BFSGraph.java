package GraphSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    public static void main(String[] args) {

        int n = 10;
        int[][] edges = {{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}};
        System.out.println(validPath(n, edges,5,9));
    }
    public static ArrayList<Integer> BFS(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V+1];

        for (int i=0;i<=V;i++){
            if (vis[i] == false) {

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);

                    for(Integer it : adj.get(node)){
                        if(vis[it] == false){
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }

    // <<<<<<< variation of BFS graph Like Bipartite graph which means no two adjacent has same two color>>>

    public static boolean checkBipartite(int n, ArrayList<ArrayList<Integer>> adj){
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for(int i=0;i<n;i++){
            if(color[i] == -1){
                if(bfsBipartiteCheck(i, adj, color)) return  false;
            }
        }
        return true;
    }

    private static boolean bfsBipartiteCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] color) {

        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;

        while (!q.isEmpty()){
            int nde = q.poll();

            for(int it : adj.get(nde)){
                if(color[it] == -1){
                    color[it] = 1-color[nde];
                    q.add(it);
                }
                else if(color[it] == color[nde]){
                    return false;
                }
            }
        }
        return true;
    }


    // this is a leetcode questions

    public static boolean validPath(int n, int[][] edges, int start, int end) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e: edges){
            addEdge(adj, e[0], e[1]);
        }
        boolean[] vis = new boolean[n];

        return bfs(start, adj, vis, end);


    }

    private static boolean bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int end) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()){
            Integer node = q.poll();

            for(Integer it : adj.get(node)){
                if(it == end) return true;
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return false;
    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
