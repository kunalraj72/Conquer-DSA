// Last updated: 12/07/2026, 02:50:21
1class Solution {
2    public int[] nextSmaller(int[] arr) {
3        int n = arr.length;
4        int[] nse = new int[n];
5        Arrays.fill(nse, n);
6
7        Deque<Integer> st = new ArrayDeque<>();
8
9        for (int i = 0; i < n; i++) {
10            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
11                nse[st.pop()] = i;
12            }
13            st.push(i);
14        }
15
16        return nse;
17    }
18
19    public int[] prevSmaller(int[] arr) {
20        int n = arr.length;
21        int[] pse = new int[n];
22        Arrays.fill(pse, -1);
23
24        Deque<Integer> st = new ArrayDeque<>();
25
26        for (int i = 0; i < n; i++) {
27            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
28                st.pop();
29            }
30
31            if (!st.isEmpty()) {
32                pse[i] = st.peek();
33            }
34
35            st.push(i);
36        }
37
38        return pse;
39    }
40
41    public int[] nextGreater(int[] arr) {
42        int n = arr.length;
43        int[] nge = new int[n];
44        Arrays.fill(nge, n);
45    
46        Deque<Integer> st = new ArrayDeque<>();
47    
48        for (int i = 0; i < n; i++) {
49            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
50                nge[st.pop()] = i;
51            }
52            st.push(i);
53        }
54    
55        return nge;
56    }
57
58    public int[] prevGreater(int[] arr) {
59        int n = arr.length;
60        int[] pge = new int[n];
61        Arrays.fill(pge, -1);
62    
63        Deque<Integer> st = new ArrayDeque<>();
64    
65        for (int i = 0; i < n; i++) {
66            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
67                st.pop();
68            }
69    
70            if (!st.isEmpty()) {
71                pge[i] = st.peek();
72            }
73    
74            st.push(i);
75        }
76    
77        return pge;
78    }
79
80    public long sumSubarrayMins(int[] arr) {
81        int n = arr.length;
82
83        int[] nse = nextSmaller(arr);
84        int[] pse = prevSmaller(arr);
85
86        long ans = 0;
87
88        for (int i = 0; i < n; i++) {
89            long left = i - pse[i];
90            long right = nse[i] - i;
91
92            long contribution = arr[i] * left * right;
93
94            ans += contribution;
95        }
96
97        return ans;
98    }
99
100    public long sumSubarrayMax(int[] arr) {
101        int n = arr.length;
102
103        int[] nse = nextGreater(arr);
104        int[] pse = prevGreater(arr);
105
106        long ans = 0;
107
108        for (int i = 0; i < n; i++) {
109            long left = i - pse[i];
110            long right = nse[i] - i;
111
112            long contribution = arr[i] * left * right;
113
114            ans += contribution;
115        }
116
117        return ans;
118    }
119
120
121    public long subArrayRanges(int[] nums) {
122        return sumSubarrayMax(nums) - sumSubarrayMins(nums);
123    }
124}