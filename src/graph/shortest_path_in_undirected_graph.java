package graph;
import java.util.*;
public class shortest_path_in_undirected_graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();   //[1, 1, -1, 0]
        adj.add(new ArrayList<Integer>(Arrays.asList(3)));
        adj.add(new ArrayList<Integer>(Arrays.asList(3)));
        adj.add(new ArrayList<Integer>());
        adj.add(new ArrayList<Integer>(Arrays.asList(0, 1)));
        int src=3;
        System.out.println(Arrays.toString(shortestPath(adj,src)));
    }
        // Function to find the shortest path from a source node to all other nodes
    public static int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        int V=adj.size();
        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbour : adj.get(node)) {
                if (1 + dis[node] < dis[neighbour]) {
                    dis[neighbour] = 1 + dis[node];
                    q.offer(neighbour);
                }
            }
        }

        //convert unreachable distances to -1
        for (int i = 0; i < V; i++) {
            if (dis[i] == Integer.MAX_VALUE) dis[i] = -1;
        }

        return dis;
    }
}
