package GraphSearies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int v; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency list
    public ArrayList<Integer> bfs = new ArrayList<>();

    // Constructor
    Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v , int w){
        adj[v].add(w);
    }

    public void BFS(int s){
        boolean visited[] = new boolean[v];
        LinkedList<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (q.size() !=0){
            s = q.poll();
            bfs.add(s);
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }

        }
    }
}
