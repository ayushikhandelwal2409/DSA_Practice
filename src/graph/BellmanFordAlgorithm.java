package graph;
import java.util.*;
public class BellmanFordAlgorithm {
    public static void main(String[] args) {
        int V = 5;       // number of vertices
        int S = 0;       // source

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        // Adding edges: {source, destination, weight}
        edges.add(new ArrayList<>(Arrays.asList(0, 2, 4)));
        edges.add(new ArrayList<>(Arrays.asList(1, 0, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 2, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4, 2)));
        edges.add(new ArrayList<>(Arrays.asList(2, 3, -3)));
        edges.add(new ArrayList<>(Arrays.asList(4, 3, 2)));

        int[] ans = bellman_ford(V, edges, S);
        if (ans.length == 1 && ans[0] == -1) {
            System.out.println("Negative cycle detected");
        } else {
            System.out.println(Arrays.toString(ans));
        }
    }
    public static int[] bellman_ford(int V,ArrayList<ArrayList<Integer>> edges,int S){
        int[] dis=new int[V];
        for (int i = 0; i < V; i++) {
            dis[i]=(int) 1e8;
        }
        dis[S]=0;
        //V x E
        for (int i = 0; i < V-1; i++) {  // means n-1 time if n=6 then n-1=5 so 0 to 4
            for(ArrayList<Integer> it:edges) {
                int u = it.get(0);
                int v = it.get(1);
                int wt = it.get(2);
                if (dis[u] != (int) 1e8 && dis[u] + wt < dis[v]) {
                    dis[v] = dis[u] + wt;
                }
            }
        }
        //Nth relaxation to check negative cycle
        for(ArrayList<Integer> it:edges){
            int u = it.get(0);
            int v = it.get(1);
            int wt = it.get(2);
            if (dis[u] != (int) 1e8 && dis[u] + wt < dis[v]) {
                return new int[]{-1};
            }
        }
        //Converting unreachable nodes to -1
        for (int i = 0; i < V; i++) {
            if (dis[i] == (int) 1e8) {
                dis[i] = -1;
            }
        }
        return dis;
    }
}
