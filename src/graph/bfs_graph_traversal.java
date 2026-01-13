package graph;

import java.util.*;

public class bfs_graph_traversal {   // or level wise traversal
    static class edge{
        int src;
        int dest;
        public edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,3));

        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,2));
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(1);// any value from 0 to v-1
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");// 1 step
                vis[curr]=true;//2 step
                for (int i = 0; i <graph[curr].size(); i++) {     //3 step
                    edge e = graph[curr].get(i);
                    q.add(e.dest );
                }
            }
        }
    }
}


//class solution {
//    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj) {
//        ArrayList<Integer> bfs = new Arraylist<>();
//        boolean vis[] = new boolean[V];
//        Queue<Integer> q = new Linkedlist<>();
//        q.add(0);
//        vis[0]= true;
//        while(!q.isEmpty()) {
//            Integer node=q.poll();
//            bfs.add(node);
//            for (Integer it : adj.get(node)){
//                if (vis[it] == false) {
//                    vis[it] = true;
//                    q.add(it);
//                }
//            }
//        }
//    return bfs;
//    }
//}