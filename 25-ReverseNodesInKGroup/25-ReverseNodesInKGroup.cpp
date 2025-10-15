// Last updated: 16/10/2025, 04:31:19
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
    
    int listLen(ListNode *head) // Find the length of the list
    {
        int count = 0;
        while(head != nullptr)
        {
            head = head->next;
            count++;
        }
        return count;
    }
    
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(head == NULL || head->next == NULL || k > listLen(head)) return head;
        
        ListNode *prev = NULL;
        ListNode *cur = head;
        ListNode *ahead = NULL;
        int count = 0;
       
        while(cur != NULL && count<k){
            ahead = cur->next;
            cur->next = prev;
            prev = cur;
            cur = ahead;
            count++;
        }
        
        if(cur != NULL){
            head->next = reverseKGroup(cur,k);
        }
        return prev;
    }
};