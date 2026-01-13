package generics;
public class LinkedList<T> {

    class Node {

        T val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void addFirst(T item) {
        Node n = new Node();
        n.val = item;
        if (size == 0) {
            head = n;
            tail = n;
            size++;
        } else {
            n.next = head;
            head = n;
            size++;
        }
    }

    // O(1)
    public void addLast(T item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node n = new Node();
            n.val = item;
            tail.next = n;
            tail = n;
            size++;
        }
    }

    //
    private Node getNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Out of Range");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // O(N)
    public void addAtIndex(T item, int k) throws Exception {
        if (k == 0) {
            addFirst(item);
        }
    }

    // O(1)
    public T getFirst() {
        return head.val;
    }

    // O(1)
    public T getLast() {
        return tail.val;
    }

    // O(N)
    public T getFromIndex(int k) throws Exception {
        return getNode(k).val;
    }

    // O(1)
    public T removeFirst() {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        }
        T val = head.val;
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return val;
    }

    // O(1)
    public T removeLast() throws Exception {
        if (size == 1) {
            return removeFirst();
        }
        T val = tail.val;
        Node temp = getNode(size - 2);
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    // O(N)
    public T removeFromIndex(int k) throws Exception {
        if (k == 0) {
            return removeFirst();
        }
        if (k == size - 1) {
            return removeLast();
        }
        Node prev = getNode(k - 1);
        Node curr = getNode(k);
        prev.next = curr.next;
        curr.next = null;
        size--;
        return curr.val;
    }

    // O(N)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
}