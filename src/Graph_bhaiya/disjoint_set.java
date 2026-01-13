package Graph_bhaiya;

import java.util.HashMap;

public class disjoint_set {
    class Node{
        int val;
        int rank;
        Node parent;
    }
    private HashMap<Integer,Node> map=new HashMap<>();
    public void create(int v){
        Node nn=new Node();
        nn.val=v;
        nn.parent=nn;
        nn.rank=0;
        map.put(v,nn);
    }
    public int find(int v){
        Node node=map.get(v);
        return find(node).val;

    }
    private Node find(Node node){
        if(node.parent==node){
            return node;
        }
        Node n=find(node.parent);
        node.parent=n;//path compression
        return n;
    }
    public void union(int v1,int v2){
        Node n1=map.get(v1);
        Node n2=map.get(v2);
        Node re1=find(n1);
        Node re2=find(n2);
        if(re1.rank==re2.rank){
            re1.parent=re2;
            re2.rank++;
        } else if (re1.rank< re2.rank) {
            re1.parent=re2;
        }else{
            re2.parent=re1;
        }
    }
}
