package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class dfs_graph_traversal {
    static class edge{
        int src;
        int dest;
        public edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<dfs_graph_traversal.edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<dfs_graph_traversal.edge>();
        }
        graph[0].add(new dfs_graph_traversal.edge(0,2));

        graph[1].add(new dfs_graph_traversal.edge(1,2));
        graph[1].add(new dfs_graph_traversal.edge(1,3));

        graph[2].add(new dfs_graph_traversal.edge(2,0));
        graph[2].add(new dfs_graph_traversal.edge(2,1));
        graph[2].add(new dfs_graph_traversal.edge(2,3));

        graph[3].add(new dfs_graph_traversal.edge(3,1));
        graph[3].add(new dfs_graph_traversal.edge(3,2));
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<dfs_graph_traversal.edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean vis[]=new boolean[v];
        dfs(graph,0,vis);
//        0 2 1 3
        System.out.println();
        int target=3;
        int src=0;
        //all_path_from_src_target(graph,"0",src,vis,target);
//        0213
//        023
    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean[] vis) {
        System.out.print(curr+" ");
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e=graph[curr].get(i);
            if(vis[e.dest]==false) {
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void all_path_from_src_target(ArrayList<edge> graph[],String path ,int curr,boolean[] vis,int tar) {
        if(curr==tar){
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e=graph[curr].get(i);
            if(vis[e.dest]==false) {
                vis[curr]=true;
                all_path_from_src_target(graph,path+e.dest,e.dest,vis,tar);
                vis[curr]=false;
            }
        }
    }
}
