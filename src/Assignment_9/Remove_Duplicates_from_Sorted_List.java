package Assignment_9;


public class Remove_Duplicates_from_Sorted_List {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val)
                cur.next = cur.next.next; // Skip duplicate
            else
                cur = cur.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        Remove_Duplicates_from_Sorted_List obj = new Remove_Duplicates_from_Sorted_List();
        ListNode result = obj.deleteDuplicates(head);

        printList(result);//1 2 3
    }
}

//Input: head = [1,1,2]
//Output: [1,2]
//tc=>O(n)
//sc=>O(1)