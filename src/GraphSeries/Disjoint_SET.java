package GraphSeries;



public class Disjoint_SET {
    int parent[] = new int[100000];
    int rank[] = new int[100000];

    void makeSet(){
        for(int i=1;i<=parent.length;i++){
            parent[i] =i;
            rank[i]  = 0;
        }
    }

    int findPar(int node){
        if(node == parent[node]) return node;

        return parent[node] = findPar(parent[node]);
    }

    void union(int u, int v){
        u = findPar(u);
        v = findPar(v);

        if(rank[u] < rank[v]) parent[u] = v;

        else if(rank[u] > rank[v]) parent[v] = u;
        else{
            parent[v] = u;
            rank[u]++;
        }
    }

    public static void main(String[] args) {

    }

}
