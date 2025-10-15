// Last updated: 16/10/2025, 04:29:54
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
    ListNode* deleteDuplicates(ListNode* head) {
        unordered_map<int,int> mp;
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
         ListNode *cur = dummy;
        
        while(cur->next != NULL){
            if(mp.find(cur->next->val) == mp.end()){
                cur = cur->next;
                mp[cur->val]++;
            }
            else{
                cur->next = cur->next->next;
            }
        }
        return dummy->next;
    }
};