package graph;
import java.util.*;
public class shortest_path_in_a_DAG_using_topo_sort {
    public static void main(String[] args) {
        int[][] edges= {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6},{5, 3, 1}};
        int V=6;
        int E=7;
        System.out.println(Arrays.toString(shortestPath(V,E,edges)));
    }
    public static int[] shortestPath(int V, int E, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new int[]{v, wt});
        }

        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                topo_sort(i, vis, st, adj);
            }
        }

        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0] = 0;

        while (!st.isEmpty()) {
            int node = st.pop();
            if (dis[node] != Integer.MAX_VALUE) {
                for (int[] neighbour : adj.get(node)) {
                    int v = neighbour[0];
                    int wt = neighbour[1];
                    if (dis[node] + wt < dis[v]) {
                        dis[v] = dis[node] + wt;
                    }
                }
            }
        }

        //convert unreachable distances to -1
        for (int i = 0; i < V; i++) {
            if (dis[i] == Integer.MAX_VALUE) dis[i] = -1;
        }

        return dis;
    }

    public static void topo_sort(int node, int[] vis, Stack<Integer> st, List<List<int[]>> adj) {
        vis[node] = 1;
        for (int[] neighbour : adj.get(node)) {
            int v = neighbour[0];
            if (vis[v] == 0) {
                topo_sort(v, vis, st, adj);
            }
        }
        st.push(node);
    }
}