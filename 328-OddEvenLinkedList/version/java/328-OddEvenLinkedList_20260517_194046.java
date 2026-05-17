// Last updated: 17/05/2026, 19:40:46
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
12    public ListNode oddEvenList(ListNode head) {
13        ListNode oddHead = new ListNode(-1);
14        ListNode odd = oddHead;
15        ListNode evenHead = new ListNode(-1);
16        ListNode even = evenHead;
17        ListNode cur = head;
18        int cnt = 1;
19
20        while(cur != null){
21            if(cnt % 2 == 0){
22                even.next = cur;
23                even = even.next;
24            }else{
25                odd.next = cur;
26                odd = odd.next;
27            }
28            cur = cur.next;
29            cnt++;
30        }
31        odd.next = evenHead.next;
32        even.next = null;
33        return oddHead.next;
34    }
35}