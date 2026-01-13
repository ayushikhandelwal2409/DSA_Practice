package tree;

public class heap_client {
    public static void main(String[] args) {
        heap hp=new heap();
        hp.add(5);
        hp.add(7);
        hp.add(9);
        hp.add(4);
        hp.add(2);
        hp.add(3);
        hp.add(1);
        hp.Display();
    }
}
//[1, 4, 2, 7, 5, 9, 3]