package graph;

import java.util.*;

public class detectCylceBfs {
    public static void main(String[] args) {
        int[][] graph= {{1,2},{0,3},{0},{1}};  //==false      //{{1,2},{0,3},{0,4},{1,5},{2,5},{3,4}};==true
        boolean cycle_is_present=bfs(graph);
        System.out.println(cycle_is_present);
    }
    public static boolean bfs(int[][] graph){
        int nodes= graph.length;
        boolean[] vis=new boolean[nodes];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < nodes; i++) {
            if(vis[i]==false){
                vis[i]=true;

                q.add(new int[]{i,-1});
                while (!q.isEmpty()) {
                    int[] arr = q.poll();
                    int node = arr[0];
                    int parent = arr[1];
                    for (int neighbour : graph[node]) {
                        if (!vis[neighbour]) {
                            vis[neighbour] = true;
                            q.offer(new int[]{neighbour, node});
                        } else if (parent != neighbour) return true;
                    }
                }
            }
        }
        return false;
    }
}
