package graph;

public class detectCycleDfs{
    public static void main(String[] args) {
        int[][] graph= {{1,2},{0,3},{0},{1}};  //==false      //{{1,2},{0,3},{0,4},{1,5},{2,5},{3,4}};==true
        boolean cycle_is_present=visited(graph);
        System.out.println(cycle_is_present);
    }
    public static boolean visited(int[][] graph){
        int nodes=graph.length;
        boolean[] vis=new boolean[nodes];
        for (int i = 0; i < nodes; i++) {
            if(!vis[i]){
                if(dfs(graph,vis,i,-1)) return true;
            }
        }
        return false;
    }
    public static boolean dfs(int[][] graph,boolean[] vis,int node,int parent){
        vis[node]=true;
        for(int adjacentNode:graph[node]){
            if(!vis[adjacentNode]){
                if(dfs(graph,vis,adjacentNode,node)) return true;
            }
            else if(adjacentNode!=parent){
                return true;
            }
        }
        return false;
    }
}
