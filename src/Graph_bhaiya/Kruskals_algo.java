package Graph_bhaiya;

import java.util.*;

public class Kruskals_algo {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Kruskals_algo(int V) {
        map = new HashMap<>();
        for (int i = 1; i <=V; i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    class EdgePair{
        int e1,e2,cost;
        public EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        @Override
        public String toString(){
            return e1+" "+e2+" @ "+cost;
        }
    }
    public List<EdgePair> getAllEdge(){
        List<EdgePair> ll=new ArrayList<>();
        for(int e1: map.keySet()){
            for(int e2: map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }
    public void Kruskals_Algo(){
        List<EdgePair> ll=getAllEdge();
        Collections.sort(ll,(a,b)->a.cost-b.cost);
        disjoint_set dsu=new disjoint_set();
        for(int v: map.keySet()){
            dsu.create(v);
        }
        int ans=0;
        for(EdgePair ep:ll){
            int re1= dsu.find(ep.e1);
            int re2= dsu.find(ep.e2);
            if(re1==re2){

            }
            else{
                dsu.union(re1,re2);
                ans+=ep.cost;
                System.out.println(ep);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Kruskals_algo ks=new Kruskals_algo(7);
        ks.addEdge(1,4,4);
        ks.addEdge(1,2,3);
        ks.addEdge(3,2,5);
        ks.addEdge(3,4,6);
        ks.addEdge(5,4,8);
        ks.addEdge(5,6,2);
        ks.addEdge(5,7,1);
        ks.addEdge(7,6,9);
        ks.Kruskals_Algo();
    }
}
