package GraphSeries;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindShortestPathUsingBFS {

    public void ShortestPath(int N, List<List<Integer>> adj, int src){
        int[] dist = new int[N];
        Arrays.fill(dist,Integer.MAX_VALUE);

        Queue<Integer> q = new LinkedList<>();

        dist[src]  = 0;
        q.add(src);

        while (!q.isEmpty()){
            int node = q.poll();

            for(int it : adj.get(node)){
                if(dist[node] + 1 < dist[it] ){
                    dist[it] = dist[node]+1;
                    q.add(it);
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}
