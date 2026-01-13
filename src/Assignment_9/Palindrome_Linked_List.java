package Assignment_9;



public class Palindrome_Linked_List {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow.next);

        ListNode firstHalf = head;
        ListNode temp = secondHalf;
        boolean palindrome = true;
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        //optional: Restore the list (reverse back)
        reverseList(secondHalf);

        return palindrome;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Helper to print a list (optional)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Palindrome_Linked_List obj = new Palindrome_Linked_List();
        System.out.println(obj.isPalindrome(head)); // true
    }
}

//tc: O(n)
//sc: O(1)