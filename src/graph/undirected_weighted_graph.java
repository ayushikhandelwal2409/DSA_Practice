package graph;
//Adjacency list
import java.util.ArrayList;

public class undirected_weighted_graph {
    static class edge{
        int src;
        int dest;
        int weight;
        public edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2,2));

        graph[1].add(new edge(1,2,10));
        graph[1].add(new edge(1,3,0));

        graph[2].add(new edge(2,0,2));
        graph[2].add(new edge(2,1,10));
        graph[2].add(new edge(2,3,-1));

        graph[3].add(new edge(3,1,0));
        graph[3].add(new edge(3,2,-1));
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);
        for (int j = 0; j <v; j++) {
            System.out.print(j+"-->{");
            for (int i = 0; i < graph[j].size(); i++) {
                edge e = graph[j].get(i);
                System.out.print("( dest:"+ e.dest +", weight:"+e.weight+ ")");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}