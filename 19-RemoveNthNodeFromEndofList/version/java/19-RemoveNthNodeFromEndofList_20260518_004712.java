// Last updated: 18/05/2026, 00:47:12
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(-1);
14        dummy.next = head;
15        int i = 0;
16        ListNode slow = dummy;
17        ListNode fast = dummy;
18        while(i <= n){
19            fast = fast.next;
20            i++;
21        }
22        while(fast != null){
23            slow = slow.next;
24            fast = fast.next;
25        }
26        slow.next = slow.next.next;
27
28        return dummy.next;
29    }
30}