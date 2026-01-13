package generics;

public class pair<t,p> {
    t x;
    p y;
    public pair(){

    }
    public pair(t x,p y){
        this.x=x;
        this.y=y;
    }
    public t getx(){
        return x;
    }

    public static void main(String[] args) {
        pair<Integer,Character> p1=new pair<>();
        pair<String,Boolean> p2=new pair<>();
    }
}
