package heap;

import java.util.*;

public class heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//gives minimum
        pq.add(22);//can use offer()
        pq.add(67);
        pq.add(21);
        pq.add(77);
        pq.add(-11);
        System.out.println(pq);
        System.out.println(pq.peek());//view
        System.out.println(pq.poll());//delete
        System.out.println(pq.peek());//view
        System.out.println(pq);
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());//gives maximum
        pq1.add(22);
        pq1.add(67);
        pq1.add(21);
        pq1.add(77);
        pq1.add(-11);
        System.out.println(pq1);
        System.out.println(pq1.peek());//view
        System.out.println(pq1.poll());//delete
        System.out.println(pq1.peek());//view
        System.out.println(pq1);

    }
}


//###########  IMPORTANT #####################################
//The time complexity of push (insertion) and pop (deletion of the highest priority element)
// operations in a standard priority queue, which is typically implemented using a binary heap, is O(logN).
//################
