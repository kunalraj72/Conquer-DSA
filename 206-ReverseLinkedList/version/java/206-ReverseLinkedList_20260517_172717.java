// Last updated: 17/05/2026, 17:27:17
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
13        ListNode cur = head;
14        ListNode prev = null;
15        ListNode next = null;
16
17        while(cur != null){
18            next = cur.next;
19            cur.next = prev;
20            prev = cur;
21            cur = next;
22        }
23        return prev;
24    }
25}