package grokking.fast_slow_pointers;

public class CycleLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(findCycleStart(head));
    }

    public static boolean hasCycle(ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    private static int calculateCycleLength(ListNode slow) {
        ListNode current = slow;
        int cycleLength = 0;
        do {
            current = current.next;
            cycleLength++;
        } while (current != slow);
        return cycleLength;
    }
    static class ListNode {
        int val = 0;
        ListNode next;

        ListNode(int value) {
            this.val = value;
        }
    }

    public static ListNode findMiddle(ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode findCycleStart(ListNode head) {
        int cycleLength = 0;
        // find the LinkedList cycle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) { // found the cycle
                cycleLength = calculateCycleLength(slow);
                break;
            }
        }

        return findStart(head, cycleLength);
    }

    private static ListNode findStart(ListNode head, int cycleLength) {
        ListNode pointer1 = head, pointer2 = head;
        // move pointer2 ahead 'cycleLength' nodes
        while (cycleLength > 0) {
            pointer2 = pointer2.next;
            cycleLength--;
        }

        // increment both pointers until they meet at the start of the cycle
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return pointer1;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // find middle of the LinkedList
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode headSecondHalf = reverse(slow); // reverse the second half
        // store the head of reversed part to revert back later
        ListNode copyHeadSecondHalf = headSecondHalf;

        // compare the first and the second half
        while (head != null && headSecondHalf != null) {
            if (head.val != headSecondHalf.val) {
                break; // not a palindrome
            }
            head = head.next;
            headSecondHalf = headSecondHalf.next;
        }

        reverse(copyHeadSecondHalf); // revert the reverse of the second half
        if (head == null || headSecondHalf == null) // if both halves match
            return true;
        return false;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
