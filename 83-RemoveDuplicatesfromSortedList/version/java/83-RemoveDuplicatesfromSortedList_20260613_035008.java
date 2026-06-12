// Last updated: 13/06/2026, 03:50:08
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode cur = head;
14        ListNode prev = new ListNode(-101); // -101 because in constraint it is given: -100 <= Node.val <= 100
15
16        while(cur != null){
17            if(cur.val == prev.val){
18                prev.next = cur.next;
19                cur = prev.next;
20            }else{
21                prev = cur;
22                cur = cur.next;
23            }
24        }
25        return head;
26    }
27}