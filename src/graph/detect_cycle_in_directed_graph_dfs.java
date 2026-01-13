package graph;

public class detect_cycle_in_directed_graph_dfs {
    public static void main(String[] args) {
        int[][] graph = {{3}, {2,3}, { 3,4}, {},{0}};//false  //{{3}, {2}, { 3,4}, {1},{0}};//false== true
        System.out.println(isCyclic(graph));
    }
     public static boolean isCyclic(int[][] graph) {
        int V=graph.length;
            // code here
        int[] vis=new int[V];
        int[] visPath=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(vis,visPath,i,graph)) return true;
            }
        }
        return false;
    }
    public static boolean dfs(int[] vis,int[] visPath ,int node,int[][] graph ){
        vis[node]=1;
        visPath[node]=1;
        for(int neighbour:graph[node]){
            if(vis[neighbour]==0){
                if(dfs(vis,visPath,neighbour,graph)) return true;
            }
            else if(visPath[neighbour]==1){
                return true;
            }
        }
        visPath[node]=0;
        return false;
    }
}

