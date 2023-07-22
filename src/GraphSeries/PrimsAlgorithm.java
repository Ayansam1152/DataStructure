package GraphSeries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    static class Node implements Comparator<Node> {

        private int v;
        private int weight;

        Node(int v, int weight){
            this.v = v;
            this.weight = weight;
        }
        Node(){};

        int getV() {
            return v;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public int compare(Node node1, Node node2) {
            if(node1.weight < node2.weight) return -1;
            if(node1.weight > node2.weight) return 1;
            return 0;
        }
    }

    static void primsAlgo(List<List<Node>> adj, int n){
        int[] key = new int[n];
        int parent[] = new int[n];
        boolean[] mstSet = new boolean[n];

        for(int i=0;i<n;i++){
            key[i] = (int)1e9;
            mstSet[i] = false;
            parent[i] = -1;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(n,new Node());

        key[0] = 0;
        parent[0]=-1;
        pq.add(new Node(0,key[0]));

        for(int i=0;i<n-1;i++){
            int u = pq.poll().getV();
            mstSet[u] = true;

            for(Node it : adj.get(u)){
                if(mstSet[it.getV()] == false &&  it.getWeight() < key[it.getV()]){
                    parent[it.getV()] = u;
                    key[it.getV()] = it.getWeight();
                    pq.add(new Node(it.getV(), key[it.getV()]));
                }
            }
        }

        for(int i=1;i<n;i++){
            System.out.println(parent[i]+" - "+i);
        }
    }

    public  static void ege(List<List<Node>> adj, int u, int v, int w){
        adj.get(u).add(new Node(v,w));
        adj.get(v).add(new Node(u,w));
    }

    public static void main(String[] args) {
        int n = 9;
        List<List<Node>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        ege(adj, 0,1,4);
        ege(adj, 0,7,8);
        ege(adj, 1,2,8);
        ege(adj, 1,7,11);
        ege(adj, 2,3,7);
        ege(adj, 2,8,2);
        ege(adj, 2,5,4);
        ege(adj, 3,4,9);
        ege(adj, 3,5,14);
        ege(adj, 4,5,10);
        ege(adj, 5,6,2);
        ege(adj, 6,7,1);
        ege(adj, 6,8,6);
        ege(adj, 7,8,7);


        primsAlgo(adj, 9);

    }


}
