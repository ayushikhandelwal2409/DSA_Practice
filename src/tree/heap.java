package tree;
import java.util.ArrayList;
public class heap {
    private  ArrayList<Integer> ll=new  ArrayList<>();
    public void add(int item){
        ll.add(item);
        unheapify(ll.size()-1);
    }
    private void unheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            unheapify(pi);
        }
    }
    private void swap(int pi,int ci){
        int p=ll.get(pi);
        int c=ll.get(ci);
        ll.set(pi,c);
        ll.set(ci,p);
    }
    private int remove(){
        swap(0,ll.size()-1);
        int val= ll.remove(ll.size()-1);
        downheapify(0);
        return val;
    }
    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<ll.size() && ll.get(mini)>ll.get(lci)){
            mini=lci;
        }
        if(rci<ll.size() && ll.get(mini)>ll.get(rci)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public int get(){
        return ll.get(0);
    }
    public int size(){
        return ll.size();
    }
    public void Display(){
        System.out.println(ll);
    }
}
