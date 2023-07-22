package GraphSeries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KruskalAlgorithm {
    class  Node{
        private int weight;
        private int v;
        private int u;

        public int getWeight() {
            return weight;
        }

        public int getU() {
            return u;
        }

        public int getV() {
            return v;
        }


        Node(int u, int v, int weight){
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
        Node(){};



    }

    class SortComparator implements Comparator<Node>{

        @Override
        public int compare(Node node1, Node node2) {
            if(node1.getWeight() < node2.getWeight()) return -1;

            else if(node1.getWeight() > node2.getWeight()) return 1;
            return 0;
        }
    }

    private int findPar(int u, int[] parent){
        if(u == parent[u]) return u;

        // this is path compression
        return parent[u] = findPar(parent[u], parent);
    }

    private void  union(int u, int v, int parent[], int rank[]){
        u = findPar(u, parent);
        v = findPar(v, parent);
        if(rank[u] < rank[v]){
            parent[u]  = v;
        }else if(rank[u] > rank[v]){
            parent[v] = u;
        }else{
            parent[u] = v;
            rank[v]++;
        }
    }

    public void KruskalAlgo(List<Node> adj, int n){
        Collections.sort(adj, new SortComparator());
        int parent[] = new int[n];
        int rank[] = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }

        int costMst =0;
        List<Node> mst = new ArrayList<>();
        for(Node it : adj){
            if(findPar(it.getU(),parent) != findPar(it.getV(), parent)){
                costMst += it.getWeight();
                mst.add(it);
                union(it.getU(), it.getV(), parent, rank);
            }
        }

        System.out.println(costMst);

        for(Node it : mst){
            System.out.println(it.getU()+"->"+it.getV());
        }
    }
}
