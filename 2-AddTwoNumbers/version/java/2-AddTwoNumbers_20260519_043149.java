// Last updated: 19/05/2026, 04:31:49
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode curL1 = l1;
14        ListNode curL2 = l2;
15        int carry = 0;
16        int sum = 0;
17        ListNode dummy = new ListNode(-1);
18        ListNode cur = dummy;
19        while(curL1 != null || curL2 != null){
20            int val1 = 0;
21            int val2 = 0;
22            if(curL1 != null) val1 = curL1.val;
23            if(curL2 != null) val2 = curL2.val;
24            sum = val1 + val2 + carry;
25            carry = 0;
26            if(sum >= 10){
27                carry = sum / 10;
28                sum = sum % 10;
29            }
30            cur.next = new ListNode(sum);
31            cur = cur.next;
32            if(curL1 != null) curL1 = curL1.next;
33            if(curL2 != null) curL2 = curL2.next;
34        }
35        if(carry > 0){
36            cur.next = new ListNode(carry);
37        }
38        return dummy.next;
39    }
40}