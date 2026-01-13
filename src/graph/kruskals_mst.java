package graph;

import java.util.Arrays;

public class kruskals_mst {
    static class UnionFind{
        int[] parent;
        int[] rank;
        UnionFind(int v){
            parent=new int[v];
            rank=new int[v];
            for (int i = 0; i <v; i++) {
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
        int V =9 ;
        int[][] edges = {
                {0, 1, 4},
                {0, 7, 8},
                {1, 2, 8},
                {1, 7, 11},
                {2, 3, 7},
                {2, 8, 2},
                {2, 5, 4},
                {3, 4, 9},
                {3, 5, 14},
                {4, 5, 10},
                {5, 6, 2},
                {6, 7, 1},
                {6, 8, 6},
                {7, 8, 7}
        };
        Arrays.sort(edges,(a,b)->a[2]-b[2]);  //sorting on the basis of wt
        int ans=0;
        UnionFind uf=new UnionFind(V);
        for(int[] edge:edges){
            if(uf.union(edge[0],edge[1])){
                ans+=edge[2];
            }
        }
        System.out.println(ans);

    }
}
