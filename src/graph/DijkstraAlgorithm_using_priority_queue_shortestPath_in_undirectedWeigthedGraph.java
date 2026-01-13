package graph;
import java.util.*;
public class DijkstraAlgorithm_using_priority_queue_shortestPath_in_undirectedWeigthedGraph {
    public static void main(String[] args) {
        int V=3;
        int src=2;
        int[][] edges= {{0, 1, 1}, {1, 2, 3}, {0, 2, 6}};
        System.out.println(Arrays.toString(dijkstra(V,edges,src)));//[4, 3, 0]
    }
    public  static int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new int[]{edge[1],edge[2]});
            adj.get(edge[1]).add(new int[]{edge[0],edge[2]});
        }

        //min-heap: [distance, node]
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] dis=new int[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        pq.offer(new int[]{0,src});
        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            int distance=arr[0];
            int node=arr[1];
            if (distance > dis[node]) continue;  //skip outdated entries from the priority queue Because the same node can be inserted multiple times with different distances.
            for(int[] l:adj.get(node)){
                int edgewt=l[1];
                int adjnode=l[0];
                if(distance+edgewt<dis[adjnode]){
                    dis[adjnode]=distance+edgewt;
                    pq.offer(new int[]{dis[adjnode],adjnode});
                }
            }

        }
        for(int i=0;i<V;i++){
            if(dis[i]==Integer.MAX_VALUE) dis[i]=-1;
        }
        return dis;
    }
}
