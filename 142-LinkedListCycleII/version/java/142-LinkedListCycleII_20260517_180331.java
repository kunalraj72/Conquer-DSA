// Last updated: 17/05/2026, 18:03:31
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14
15        if(head == null || head.next == null){
16            return null;
17        }
18
19        ListNode slow = head;
20        ListNode fast = head;
21
22        while(fast != null && fast.next != null){
23            slow = slow.next;
24            fast = fast.next.next;
25            if(slow == fast) break;
26        }
27        if(slow != fast) return null;
28        slow = head;
29        while(slow != fast){
30            slow = slow.next;
31            fast = fast.next;
32        }
33        return slow;
34    }
35}