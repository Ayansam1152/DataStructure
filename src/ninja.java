import java.util.*;

public class ninja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1;i< n;i++){
            addEdge(adj, sc.nextInt(), sc.nextInt());
        }


        for(int i=1;i<=n;i++){
            boolean[] vis = new boolean[n+1];
            System.out.print(count(adj,i,vis)+" ");
            Arrays.fill(vis, false);
        }
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static int count(ArrayList<ArrayList<Integer>> adj, int i, boolean[] vis){

        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        int cnt =0;
        vis[i+1] = true;
        while (!q.isEmpty()){
            int node = q.remove();

            for(int it : adj.get(node)){
                cnt++;
                if(!vis[it]){
                    q.add(it);
                }
            }
        }
        return cnt;
    }
}
