// Last updated: 16/10/2025, 04:25:41
class StockSpanner {
public:
    stack<int> st;
    vector<int> arr;
    int count;
    StockSpanner() {
        count = 0;
    }
    
    int next(int price) {
        while(!st.empty() && arr[st.top()]<=price){
            st.pop();
        }
        int ans;

        if(st.empty()) ans = count+1;
        else ans = count-st.top();

        st.push(count);
        arr.push_back(price);
        count++;
        return ans;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */