package Graph_bhaiya;
import java.util.*;

public class MST_0_1 {
    static HashMap<Integer,TreeSet<Integer>> map=new HashMap<>();

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++){
            map.put(i,new TreeSet<>());
        }
        for (int i = 1; i <=m; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        System.out.println(prims());
    }
    public static int prims(){
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Pair(1,0));
        HashSet<Integer> vis=new HashSet<>();
        int sum=0;
        while(!pq.isEmpty()){
            //1.remove
            Pair rp=pq.poll();
            //2.ignore if already visited
            if(vis.contains(rp.vtx)){
                continue;
            }
            //3. mark visited
            vis.add(rp.vtx);
            //4.self work
            sum+=rp.cost;
            //5.add neighbour
            for (int i = 1; i <=map.size(); i++) {
                if(!vis.contains(i)){
                    int cost=0;
                    if(map.get(rp.vtx).contains(i)){
                        cost++;
                    }
                    pq.add(new Pair(i,cost));
                }
            }
        }
        return sum;
    }
    static class Pair{
        int vtx;
        int cost;
        public Pair(int vtx,int cost){
            this.vtx=vtx;
            this.cost=cost;
        }
    }
}
