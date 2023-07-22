package GraphSearies;

import java.util.*;


public class BFSAlgo {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        int V = 4;
        Map<Integer, List<Integer>> map = new HashMap<>();

        // this is for edges
        for(int i=0;i<3;i++){
            int u= sc.nextInt();
            int v = sc.nextInt();
            if(map.containsKey(u)){
                map.put(u, Collections.singletonList(v));
            }
        }
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for(int i=0;i<=v;i++){
//            adj.add(new ArrayList<>());
//        }
//        DfsAlgo obj = new DfsAlgo();
//
//       addEdge(0,1 ,adj);
//        addEdge(0,2 ,adj);
//        addEdge(0,3  ,adj);
//        addEdge(2,4 ,adj);
//        addEdge(3,1 ,adj);
//        System.out.println(obj.dfsOfGraph(v,adj));

//        printGraph(adj);
    }

    public static void addEdge(int u, int v,ArrayList<ArrayList<Integer>> adj ){
       // This is the directed graph only
        adj.get(u).add(v);
        // if you add one line then it will become undirected graph
         adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.println("\nAdjacency list of vertex"+i);
            System.out.print("head");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> bfs(int noOfNodes , ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[noOfNodes+1];
        for(int i=0;i<=noOfNodes;i++){
            if(!vis[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;
                while (!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);
                    for(Integer it : adj.get(node)){
                        if(!vis[it]){
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }
}
