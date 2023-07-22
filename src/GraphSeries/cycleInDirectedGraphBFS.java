package GraphSeries;

import java.util.*;

public class cycleInDirectedGraphBFS {
    

    public static void main(String[] args) {
        int N = 6;
        List<List<Integer>> adj;
        adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 5,0);
        addEdge(adj, 5,2);
        addEdge(adj, 4,0);
        addEdge(adj, 4,1);
        addEdge(adj, 2,3);
        addEdge(adj, 3,1);
        System.out.println("is there is cycle ? ==>"+isCycle(N, adj));
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }

    public static boolean isCycle(int N, List<List<Integer>> adj){

        int inDegree[] = new int[N];

        for(int i=0;i<N;i++){
            for(Integer it : adj.get(i)){
                inDegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int count =0;
        while(!q.isEmpty()){
            Integer node = q.poll();
           count++;

            for(Integer it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }
        }
        if(count == N) return false;
        return true;
    }
}
