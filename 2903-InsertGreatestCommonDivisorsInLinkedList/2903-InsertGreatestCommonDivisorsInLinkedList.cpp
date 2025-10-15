// Last updated: 16/10/2025, 04:23:58
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
    int gcd(int x, int y){
        if(x == 0){
            return y;
        }
        if(y == 0){
            return x;
        }
        while(x != y){
            if(x > y){
                x -= y;
            }
            else{
                y -= x;
            }
        }
        return x;
    }
    
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        if(head == NULL || head->next == NULL){
            return head;
        }
        ListNode *cur = head;
        ListNode *prev = NULL;
        while(cur->next != NULL){
            prev = cur;
            cur = cur->next;
            int x = prev->val;
            int y = cur->val;;
            
            int data = gcd(x,y);
            ListNode *temp = new ListNode(data);
            prev->next = temp;
            temp->next = cur;
            
        }
        return head;
    }
};