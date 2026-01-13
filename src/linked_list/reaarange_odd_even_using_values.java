package linked_list;

import java.util.Scanner;

public class reaarange_odd_even_using_values {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
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

        ListNode oddHead = new ListNode(0); // Dummy head for odd nodes
        ListNode evenHead = new ListNode(0); // Dummy head for even nodes
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode current = head;

        // Traverse the original list and separate odd and even values
        while (current != null) {
            if (current.val % 2 != 0) { // Odd value
                odd.next = current;
                odd = odd.next;
            } else { // Even value
                even.next = current;
                even = even.next;
            }
            current = current.next;
        }

        // Connect the end of odd list to the head of even list
        odd.next = evenHead.next;
        even.next = null; // End the even list
        ListNode k=oddHead.next;
        while(k!=null){
            System.out.print(k.val+" ");
            k=k.next;
        }
    }
}
//6
//        1 2 3 11 4 5
//        1 3 11 5 2 4