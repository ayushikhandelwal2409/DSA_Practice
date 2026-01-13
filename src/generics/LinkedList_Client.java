package generics;

public class LinkedList_Client {

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10);
        ll1.addFirst(20);
        ll1.addFirst(30);
        ll1.addFirst(40);
        ll1.display();

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.addFirst("first");
        ll2.addFirst("second");
        ll2.addFirst("third");
        ll2.addFirst("fourth");
        ll2.display();
    }
}