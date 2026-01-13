package graph;

import java.util.*;

public class PrimsAlgorithm_MinimumSpanningTree {
    public static void main(String[] args) {
        int nodes=3;
        int[][] edges= {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new int[]{edge[1],edge[2]});
            adj.get(edge[1]).add(new int[]{edge[0],edge[2]});
        }
        ArrayList<int[]> res=new ArrayList<>();
        int ans=primMST(nodes,adj,res);
        System.out.println(ans);//4
        for (int i = 0; i < res.size(); i++) {
            System.out.print(Arrays.toString(res.get(i)));//[0, 0][0, 2][2, 1]
        }
    }
    public static int primMST(int nodes,ArrayList<ArrayList<int[]>> adj,ArrayList<int[]> res){
        int[] vis=new int[nodes];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,-1});// wt,node,parent
        int sum=0;
        while(pq.size()>0){
            int[] arr=pq.poll();
            int node=arr[1];
            int wt=arr[0];
            int parent=arr[2];
            if(vis[node]==1) continue;
            vis[node]=1;
            sum+=wt;
            res.add(new int[]{parent,node});
            for(int[] neighbour:adj.get(node)) {
                int adjnode =neighbour[0];
                int edw = neighbour[1];
                if (vis[adjnode] == 0) {
                    pq.add(new int[]{edw, adjnode,node});
                }
            }
        }
        return sum;
    }
}
