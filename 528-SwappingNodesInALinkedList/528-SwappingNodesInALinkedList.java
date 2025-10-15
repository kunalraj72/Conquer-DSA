// Last updated: 16/10/2025, 04:26:31
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        int n = 0;
        int count = 0;
        ListNode cur = head;
        ListNode first = null;
        ListNode second = null;

        while(cur != null){
            n++;
            cur = cur.next;
        }
        cur = head;
        int flag = 0;
        while(cur != null && (first == null || second == null)){
            count++;
            if(count == k){
                first = cur;
                flag++;
            }if(count == (n - k + 1)){
                second = cur;
                flag++;
            }
            cur = cur.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}