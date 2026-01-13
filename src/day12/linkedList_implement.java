package day12;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    public Node(){
        this.next=null;
    }
    public Node(int val){
        this.next=null;
        this.val=val;
    }
    public void add(int val){
        Scanner in=new Scanner(System.in);
        Node head=null;
        Node tail=null;
        while(in.hasNext()){
            int t=in.nextInt();
            head.val=t;
            head=head.next;
        }

    }
}

public class linkedList_implement {

}
