// Last updated: 20/05/2026, 04:36:17
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
12    public ListNode rotateRight(ListNode head, int k) {
13
14        if(head == null || head.next == null || k == 0) return head;
15    
16        ListNode prev = head;
17        ListNode cur = head;
18        int i = 0;
19        int length = 0;
20        while(cur != null){
21            cur = cur.next;
22            length++;
23        }
24        if(k % length == 0) return head;
25        if(length > 0) k = k % length;
26        cur = head;
27
28        // Maintain gap of k
29        while(i < k && cur != null){
30            cur = cur.next;
31            i++;
32        }
33        if(cur != null){
34            while(cur.next != null){
35            cur = cur.next;
36            prev = prev.next;
37           }
38        }
39
40        // prev = kth-1 node from end
41        ListNode newHead = null;
42        if(prev != null) newHead = prev.next;
43        // Break list
44        if(prev != null) prev.next = null;
45        // Connect tail to old head
46        if(cur != null) cur.next = head;
47        
48        return newHead;
49
50    }
51}