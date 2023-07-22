package GraphSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ShortestPathInWeightedDAG {

    //institution is first find the topo sort and store it in a stack and then check
    public static void main(String[] args) {
        int N = 4;
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1,10);
        addEdge(adj, 0,2,3);
        addEdge(adj, 0,3,2);
        addEdge(adj, 1,3,7);
        addEdge(adj, 2,3,6);

        shortestPath(0, adj, N);

    }


    static class  Pair{
        private int v;
        private int weight;
        Pair(int _v, int _weight){
            v = _v;
            weight = _weight;
        }
        int getV(){
            return v;
        }
        int getWeight(){
            return weight;
        }
    }
   static void shortestPath(int s, List<List<Pair>> adj, int n){
        Stack<Integer> stack = new Stack<>();
        int[] dist = new int[n];

        boolean visited[]  = new boolean[n];
        for(int i=0;i<n;i++){
            visited[i] = false;
        }

        for(int i=0;i<n;i++){
            if(visited[i] == false){
                topologicalSortUtil(i, visited,adj,stack);
            }
        }
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        while (!stack.isEmpty()){
            int node = stack.pop();

            if(dist[node] != Integer.MAX_VALUE){
                for(Pair it : adj.get(node)){
                    if(dist[node] + it.getWeight() < dist[it.getV()]){
                        dist[it.getV()] = dist[node] + it.getWeight();
                    }
                }
            }
        }

        for(int i=0;i< n;i++){
            if(dist[i] == Integer.MAX_VALUE){
                System.out.print("INF");
            }else{
                System.out.print(dist[i]+" ");
            }
        }

    }


    private static void topologicalSortUtil(int node, boolean[] vis, List<List<Pair>> adj, Stack stack) {
        vis[node] = true;

        for(Pair it : adj.get(node)){
            if(vis[it.getV()] == false){
                topologicalSortUtil(it.getV(),vis,adj,stack);
            }
        }
        stack.add(node);
    }

    public static void addEdge(List<List<Pair>> adj, int u, int v, int w){

        adj.get(u).add(new Pair(v,w));
    }

}
