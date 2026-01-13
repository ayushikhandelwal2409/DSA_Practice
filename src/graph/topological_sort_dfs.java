package graph;

import java.util.*;

public class topological_sort_dfs {
    public static void main(String[] args) {
        int[][] graph={{},{},{3},{1},{1,0},{2,0}};//[5, 4, 2, 3, 1, 0]
        System.out.println(Arrays.toString(topo_sort(graph)));
    }
    public static int[] topo_sort(int[][] graph){
        int V= graph.length;
        int[] vis=new int[V];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < V; i++) {
            if(vis[i]==0){
                dfs(i,vis,st,graph);
            }
        }
        int[] ans=new int[V];
        int i=0;
        while (!st.isEmpty()){
            ans[i]=st.pop();
            i++;
        }
        return ans;
    }
    public static void dfs(int node,int[] vis,Stack<Integer> st,int[][] graph){
        vis[node]=1;
        for(int neighbour:graph[node]){
            if(vis[neighbour]==0){
                dfs(neighbour,vis,st,graph);
            }
        }
        st.push(node);
    }
}
