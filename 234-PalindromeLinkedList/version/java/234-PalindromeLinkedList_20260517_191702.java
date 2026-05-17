// Last updated: 17/05/2026, 19:17:02
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
12
13    public ListNode reverseList(ListNode head){
14
15        if(head == null) return null;
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
28
29    public boolean isPalindrome(ListNode head) {
30        ListNode slow = head;
31        ListNode fast = head;
32        ListNode prev = null;
33
34        if(head == null || head.next == null){
35            return true;
36        }
37
38        while(fast != null && fast.next != null){
39            prev = slow;
40            slow = slow.next;
41            fast = fast.next.next;
42        }
43        //handling odd List scenario
44        if(fast != null){
45            slow = slow.next;
46        }
47        prev.next = reverseList(slow);
48        ListNode cur = prev.next;
49        while(head != cur && cur != null){
50            if(head.val != cur.val){
51                return false;
52            }
53            head = head.next;
54            cur = cur.next;
55        }
56        return true;
57    }
58}