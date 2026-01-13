package Graph_bhaiya;
import java.util.*;

public class bellman_ford {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public bellman_ford(int v) {
        map=new HashMap<>();
        for(int i=1;i<=v;i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1,int v2,int cost) {
        map.get(v1).put(v2,cost);// outgoing on v1 & incoming on v2  (v2 indegree increases)

    }

    class EdgePair{
        int e1,e2,cost;
        public EdgePair(int e1, int e2, int cost ){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
    }

    public List<EdgePair> getAllEdge(){
        List<EdgePair> ll =new ArrayList<>();
        for(int e1:map.keySet()) {
            for(int e2:map.get(e1).keySet()) {
                int cost=map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }

    public void BellmanFord_Algo() {
        int v=map.size();
        int dp[]=new int[v+1];
        // src==1
        for(int i=2;i<dp.length;i++) {
            dp[i]=9999999;

        }
        List<EdgePair> ll=getAllEdge();
        for(int i=1;i<=v;i++) {
            for(EdgePair e:ll) {
                if(i==v && dp[e.e2]>dp[e.e1]+e.cost) {
                    System.out.println("ive wt ka cycle");
                    return ;
                }
                if(dp[e.e2]>dp[e.e1]+e.cost) {
                    dp[e.e2]=dp[e.e1]+e.cost;
                }
            }
        }
        for(int i=1;i<dp.length;i++) {
            System.out.println(dp[i]+" ");
        }
    }
    public static void main(String[] args) {
        bellman_ford bf = new bellman_ford(5);
        bf.AddEdge(1, 2, 8);
        bf.AddEdge(1, 3, 4);
        bf.AddEdge(1, 4, 5);
        bf.AddEdge(2, 5, 2);
//		bf.AddEdge(2, 5, -2); // lead to -ve wt ka cycle
        bf.AddEdge(5, 2, 1);
        bf.AddEdge(3, 4, -3);
        bf.AddEdge(4, 5, 4);
        bf.BellmanFord_Algo();

    }

}
//0
//6
//4
//1
//5

