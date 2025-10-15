// Last updated: 16/10/2025, 04:28:57
class LRUCache {
public:
    class node {
    public:
    int key;
    int val;
    node *next;
    node *prev;
    node(int _key, int _val){
        key = _key;
        val = _val;
      }
    };
    
    node *head = new node(-1,-1);
    node *tail = new node(-1,-1);
    int cap;
    unordered_map<int, node*> mp;
    
    void addNode(node *newNode){
        node *temp = head->next;
        newNode->next = temp;
        newNode->prev = head;
        head->next = newNode;
        temp->prev = newNode;
    }
    
    void deleteNode(node *deleteNode){
        node *delPrev = deleteNode->prev;
        node *delNext = deleteNode->next;
        delPrev->next = delNext;
        delNext->prev = delPrev;
    }
    
     LRUCache(int capacity) {
        cap = capacity;
        head->next = tail;
        tail->prev = head;
    }
    
    int get(int key_) {
        if(mp.find(key_) != mp.end()){
            node *resNode = mp[key_];
            int res = resNode->val;
            mp.erase(key_);
            deleteNode(resNode);
            addNode(resNode);
            mp[key_] = head->next;
            return res;
        }
        return -1;
    }
    
    void put(int key_, int value) {
        if(mp.find(key_) != mp.end()){
            node *existingNode = mp[key_];
            mp.erase(key_);
            deleteNode(existingNode);
        }
        if(mp.size() == cap){
            mp.erase(tail->prev->key);
            deleteNode(tail->prev);
        }
        addNode(new node(key_, value));
        mp[key_] = head->next;
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */