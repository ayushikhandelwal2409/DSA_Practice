package HASHMAP;

import java.util.*;

public class HashMap<K,V> {
    class  Node{
        K key;
        V value;
        Node next;

    }
    private int size=0;
    ArrayList<Node> bukt=new ArrayList<>();
    public HashMap(){
        this(4);
    }
    public HashMap(int n){
        for (int i = 0; i < n; i++) {
            bukt.add(null);
        }
    }
    public void put(K key,V value){
        int idx=hashFun(key);
        Node temp=bukt.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value=value;
                return;
            }
            temp=temp.next;
        }
        Node nn=new Node();
        nn.key=key;
        nn.value=value;
        temp=bukt.get(idx);
        nn.next=temp;
        bukt.set(idx,nn);
        size++;
        double thf=2.0;
        double lf=(1.0*size)/bukt.size();
        if(lf>thf){
            rehashing();
        }
    }
    private  void rehashing(){
        ArrayList<Node> new_bukt=new ArrayList<>();
        for (int i = 0; i < 2*bukt.size(); i++) {
            new_bukt.add(null);
        }
        ArrayList<Node> oba=bukt;
        bukt=new_bukt;
        size=0;
        for(Node nn:oba){
            while(nn!=null){
                put(nn.key,nn.value);
                nn=nn.next;
            }
        }
    }
    @Override
    public String toString(){
        String s="{";
        for(Node nn:bukt){
            while(nn!=null){
                s=s+nn.key+"="+nn.value+",";
                nn=nn.next;
            }
        }
        return s.substring(0,s.length()-1)+"}";
    }
    public V get(K key){
        int idx=hashFun(key);
        Node temp=bukt.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }
    public boolean containsKey(K key){
        int idx=hashFun(key);
        Node temp=bukt.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public V remove(K key){
        int idx=hashFun(key);
        Node curr=bukt.get(idx);
        Node prev=null;
        while(curr!=null){
            if(curr.key.equals(key)){
                //prev.next=curr.next;
                //
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            return null;
        }
        else if(prev==null){
            bukt.set(idx,curr.next);
        }
        else{
            prev.next=curr.next;
        }
        curr.next=null;
        size--;
        return curr.value;
    }
    public  int hashFun(K key){
        int idx=key.hashCode()% bukt.size();
        if(idx<0){
            idx+=bukt.size();
        }
        return idx;
    }

}

// entry set

//HashMap<String,String> map=new HashMap<>();
//for(Map.Entry<String ,String> entry:map.entrySet()){
//    String key= entry.getKey();
//    String  val=entry.getValue();
//}