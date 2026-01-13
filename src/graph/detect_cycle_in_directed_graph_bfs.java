package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class detect_cycle_in_directed_graph_bfs {
    public static void main(String[] args) {
        int[][] graph={{1},{2},{3,4},{1},{}};//true
        System.out.println(topo_sort(graph));
    }
    public static boolean topo_sort(int[][] graph){
        int V= graph.length;
        int[] indegree=new int[V];
        for (int i = 0; i < V; i++) {
            for (int j:graph[i]){
                indegree[j]++;

            }
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int[] topo=new int[V];//int cnt=0;
        int i=0;
        while (!q.isEmpty()){
            int node=q.peek();
            q.poll();
            topo[i++]=node;//cnt++;
            for(int neighbour:graph[node]){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        if(i==V){ //cnt==V
            return false;
        }
        return true;
    }
}
