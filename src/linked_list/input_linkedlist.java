package linked_list;
import java.util.*;

public class input_linkedlist {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
        public static void display(ListNode next){
            ListNode head=next;
            while(head!=null){
                System.out.print(head.val+" ");
                head=head.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListNode node=new ListNode();
        int n=in.nextInt();
        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        node.display(head);
    }

}