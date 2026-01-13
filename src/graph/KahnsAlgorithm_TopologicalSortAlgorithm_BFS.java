package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KahnsAlgorithm_TopologicalSortAlgorithm_BFS {
    public static void main(String[] args) {
        int[][] graph={{},{},{3},{1},{0,1},{0,2}};//[4, 5, 0, 2, 3, 1]
        System.out.println(Arrays.toString(topo_sort(graph)));
    }
    public static int[] topo_sort(int[][] graph){
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
        int[] topo=new int[V];
        int i=0;
        while (!q.isEmpty()){
            int node=q.poll();
            topo[i]=node;
            i++;
            for(int neighbour:graph[node]){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        return topo;
    }
}
