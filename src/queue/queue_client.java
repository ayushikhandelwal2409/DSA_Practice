package queue;

public class queue_client {
    public static void main(String[] args)throws Exception {
        Queue q= new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Display();
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enqueue(50);
        q.Enqueue (60);
        q.Display();
        System.out.println(q.getFront());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
