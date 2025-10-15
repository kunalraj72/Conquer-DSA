// Last updated: 16/10/2025, 04:30:22
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    
    ListNode* rotateRight(ListNode* head, int k) {
        if(head == NULL || head->next == NULL || k==0) return head;
        ListNode *cur = head;
        int cnt = 1;
        while(cur->next != NULL){
            cur = cur->next;
            cnt++;
        }
        if(k == cnt) return head;
        cur->next = head;
        ListNode *temp = head;
        k = k%cnt;
        int ultacnt = 1;
        while(ultacnt != cnt-k){
            temp = temp->next;
            ultacnt++;
        }
        head = temp->next;
        temp->next = NULL;
        return head;
    }
};