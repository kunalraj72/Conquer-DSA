// Last updated: 17/05/2026, 17:28:14
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
12    public ListNode reverseList(ListNode head) {
13
14        if (head == null || head.next == null) return head;
15        
16        ListNode cur = head;
17        ListNode prev = null;
18        ListNode next = null;
19
20        while(cur != null){
21            next = cur.next;
22            cur.next = prev;
23            prev = cur;
24            cur = next;
25        }
26        return prev;
27    }
28}