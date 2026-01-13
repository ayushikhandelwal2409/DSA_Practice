package Graph_bhaiya;
import java.util.*;

public class Graph_valid_tree {
    public static void main(String[] args) {
        int V=5;
//        int[][] edges = {{0, 1},{0, 2},{0, 3},{1, 4}};// true
        int[][] edges={{0,1},{1,2},{2,3},{1,3},{1,4}}; // false
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        System.out.println(check(adj));
    }
    public static boolean check(ArrayList<ArrayList<Integer>> adj){
        int n= adj.size();
        int[] vis=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                 cnt++;
                 if(cnt>1) return false;
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i, -1}); // {node, parent}
                vis[i] = 1;
                 while(!q.isEmpty()){
                     int[] pair = q.poll();
                     int node = pair[0];
                     int parent = pair[1];
                     for(int neighbour:adj.get(node)){
                         if(vis[neighbour]!= 1) {
                             vis[neighbour] = 1;
                             q.add(new int[]{neighbour, node});
                         }
                         else if(parent!=neighbour){
                             return false;
                         }
                     }
                 }
             }
        }
        return true;
    }
}
