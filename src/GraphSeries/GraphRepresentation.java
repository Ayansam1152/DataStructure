package GraphSeries;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,4);
        addEdge(adj,1,2);
//        addEdge(adj,1,3);
//        addEdge(adj,1,4);
        addEdge(adj,3,4);

        printGraph(adj);
//        System.out.print(DFSGraph.DfsOfGraph(V, adj));
//        System.out.print(BFSGraph.BFS(V, adj));
        System.out.println(cycleDetectionUsingDFS.DFSCycle(V, adj));
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for(int j = 0;j<adj.get(i).size();j++){
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
