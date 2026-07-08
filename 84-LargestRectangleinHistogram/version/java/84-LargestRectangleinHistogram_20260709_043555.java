// Last updated: 09/07/2026, 04:35:55
1class Solution {
2
3    public int[] nextSmallerElement(int[] arr) {
4        // code here
5        Stack<int[]> st = new Stack<>();
6        int n = arr.length;
7        int i = 0;
8        int [] ans = new int[n];
9        Arrays.fill(ans, -1);
10        
11        while(i < n){
12            if(st.empty()){
13                st.push(new int []{arr[i], i});
14            }else if(arr[i] >= st.peek()[0]){ //adding equal height because i need to maximize the area
15                st.push(new int []{arr[i], i});
16            }else{
17                while(!st.empty() && arr[i] < st.peek()[0]){
18                    ans[st.peek()[1]] = i; //storing index because i need to calc. area
19                    st.pop();
20                }
21                st.push(new int []{arr[i], i});
22            }
23            i++;
24        }
25        return ans;
26    }
27
28    public int[] prevSmallerElement(int[] arr) {
29        // code here
30        Stack<int[]> st = new Stack<>();
31        int n = arr.length;
32        int i = n - 1;
33        int [] ans = new int[n];
34        Arrays.fill(ans, -1);
35        
36        while(i >= 0){
37            if(st.empty()){
38                st.push(new int []{arr[i], i});
39            }else if(arr[i] >= st.peek()[0]){ //adding equal height because i need to maximize the area
40                st.push(new int []{arr[i], i});
41            }else{
42                while(!st.empty() && arr[i] < st.peek()[0]){
43                    ans[st.peek()[1]] = i;  //storing index because i need to calc. area
44                    st.pop();
45                }
46                st.push(new int []{arr[i], i});
47            }
48            i--;
49        }
50        return ans;
51    }
52
53    public int largestRectangleArea(int[] heights) {
54        int n = heights.length;
55        int[] next = nextSmallerElement(heights);
56        int[] prev = prevSmallerElement(heights);
57
58        int area = Integer.MIN_VALUE;
59        for(int i = 0; i < n; i++){
60            int length = heights[i];
61            if(next[i] == -1) next[i] = n;  // = (next[i] - 1) - (prev[i] + 1) + 1
62            if(prev[i] == -1) prev[i] = -1;  // = (next[i] - 1) - (prev[i] + 1) + 1
63
64            int breadth = next[i] - prev[i] - 1; // = (next[i] - 1) - (prev[i] + 1) + 1
65            int newArea = length * breadth;
66            area = Math.max(area, newArea);
67        }
68        return area;
69    }
70}