package linked_list;

public class reverse_ll {
    static class ListNode{
        ListNode next ;
        int val;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }

    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        printList(head);
        // Reverse the linked list
        ListNode reversedHead = reverse(head);
        printList(reversedHead);
    }
    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextnode=null;
        while (curr != null) {
            nextnode= curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
