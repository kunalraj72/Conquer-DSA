// Last updated: 16/10/2025, 04:31:12
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // Utility function to calculate length of the list
    private int listLen(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k > listLen(head)) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count = 0;

        // Reverse first k nodes
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Recur for the remaining list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev; // prev is the new head after reversal
    }
}