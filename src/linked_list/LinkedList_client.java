package linked_list;

public class LinkedList_client {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddLast(40);
        //ll.AddAtIdx(99,5);
        ll.Display();

    }
}
