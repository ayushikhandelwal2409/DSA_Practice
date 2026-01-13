package queue;

public class Queue {
    private int[] arr;
    private int front = 0;
    private int size = 0;
    public Queue() {
        arr = new int[5];
    }
    public Queue(int n) {
        arr=new int[n];
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==arr.length;
    }
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("overflow");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
    }
    public int Dequeue()throws Exception {
        if(isEmpty()){
            throw new Exception("underflow");
        }
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int getFront(){
        return arr[front];
    }
    public int size() {
        return size;
    }
    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
//add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception.
//offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.
//remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
//poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.
//element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
//peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
//(front end)(peek,dequeue)  <==  10 20 30 40 ==>  (rear end)(enqueue)