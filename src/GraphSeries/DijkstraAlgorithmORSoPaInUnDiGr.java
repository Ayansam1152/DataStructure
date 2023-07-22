package GraphSeries;

import java.util.*;

public class DijkstraAlgorithmORSoPaInUnDiGr {

    public static void main(String[] args) {
        List<List<Pair>> adj = new ArrayList<>();

        for(int i=0;i<7;i++){
            adj.add(new ArrayList<>());
        }
        int[][] roads = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};

        for(int[] e : roads){
            addEdge(adj,e[0],e[1],e[2]);
        }
        shortestPath(0,adj, 7);
    }

    public static void addEdge(List<List<Pair>> adj,int u, int v, int weight){
        adj.get(u).add(new Pair(v, weight));
        adj.get(v).add(new Pair(u, weight));
    }

    static  class  Pair implements Comparator<Pair>{
       private int v;
        private int weight;
        Pair( int v, int weight){
            this.v = v;
            this.weight = weight;
        }

        public Pair() {

        }

        public int getV() {
            return v;
        }

        public int getWeight() {
            return weight;
        }


        @Override
        public int compare(Pair o1, Pair o2) {
            if(o1.weight < o2.weight) return  -1;
            if (o1.weight > o2.weight) return 1;
            return 0;
        }
    }


    public  static void shortestPath(int s, List<List<Pair>> adj, int N){
        int[] dist = new int[N];

        Arrays.fill(dist, (int) 1e9);

        PriorityQueue<Pair> pq = new PriorityQueue<>(N, new Pair());
        pq.add(new Pair(s,0));

        while (!pq.isEmpty()){
            Pair node = pq.poll();

            for(Pair it : adj.get(node.getV())){
                if(dist[node.getV()] + it.getWeight()  < dist[it.getV()]){
                    dist[it.getV()] = dist[node.getV()] + it.getWeight();
                    pq.add(new Pair(it.getV(), dist[it.getV()]));
                }
            }
        }

        System.out.println(Arrays.toString(dist));

    }
}
