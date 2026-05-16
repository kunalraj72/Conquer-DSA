// Last updated: 17/05/2026, 04:50:23
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution {
10    public void deleteNode(ListNode node) {
11        ListNode prev = null;
12        while(node.next != null){
13            prev = node;
14            node.val = node.next.val;
15            node = node.next;
16        }
17        prev.next = null;
18    }
19}
20
21//just hume node next ka value node me dalna hai