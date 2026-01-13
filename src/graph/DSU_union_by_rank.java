package graph;

public class DSU_union_by_rank {
     static class UnionFind{
        int[] parent;
        int[] rank;
        UnionFind(int v){
            parent=new int[v+1];
            rank=new int[v+1];
            for (int i = 0; i <=v; i++) {
                parent[i]=i;
            }
        }

        public int find(int node) {
            if(parent[node]==node){
                return node;
            }
            int n=find(parent[node]);
            parent[node]=n;   // path compression
            return n;
        }
        public boolean union(int u,int v){
            int parent_u=find(u);
            int parent_v=find(v);
            if(parent_v==parent_u){
                return false;    // it means there root nodes are same and on connecting them  it will make cycle so we will not do union
            }
            if(rank[parent_u]> rank[parent_v]){
                parent[parent_v]=parent_u;
            }
            else if(rank[parent_u]<rank[parent_v]){
                parent[parent_u]=parent_v;
            }
            else{
                parent[parent_v]=parent_u;
                rank[parent_u]++;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        UnionFind uf=new UnionFind(4);
        uf.union(1,2);
        uf.union(1,3);
        if(uf.union(2,4))
            System.out.println("Possible");
        else{
            System.out.println("Not possible");
        }
    }
} //possible
