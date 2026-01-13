package bootcamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class day_1_PRINT_ADJ_LIST {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int V=4;
        int[][] edges={{0,1},{0,2},{1,2},{2,3}};
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        System.out.println(adj);
        dfs(adj,V);
        bfs(adj,V);
        System.out.println("end");
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int v){
        boolean[] vis=new boolean[v];
        int src=0;
        dfss(adj,src,vis);
        System.out.println("end");
    }
    public static void dfss(ArrayList<ArrayList<Integer>> adj,int node,boolean[] vis){
        vis[node]=true;
        System.out.print(node+" -> ");
        for(int neighbour:adj.get(node)){
            if(vis[neighbour]==false){
                dfss(adj,neighbour,vis);
            }
        }
    }
    public static void bfs(ArrayList<ArrayList<Integer>> adj,int v){
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[v];
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" -> ");
            for(int neighour:adj.get(node)){
                if(vis[neighour]==false){
                    vis[neighour]=true;
                    q.add(neighour);
                }
            }
        }
    }
}

//0->1,2
//1-> 0,2
//2->0,1,3
//3->2