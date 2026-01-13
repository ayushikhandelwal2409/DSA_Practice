package generics;

public class Cars {//implements Comparable<Cars>{//P S C
    int price;
    int speed;
    String color;
    public Cars(){

    }
    public Cars(int price,int speed,String color){
        this.price=price;
        this.speed=speed;
        this.color=color;
    }
    public String toString(){
        return "P "+price+" S "+speed+" C "+color;
    }

//    @Override
//    public int compareTo(Cars o) {
//        //return this.price-o.price;
//        //return o.speed-this.speed;
//        return this.color.compareTo(o.color);
//    }
}
