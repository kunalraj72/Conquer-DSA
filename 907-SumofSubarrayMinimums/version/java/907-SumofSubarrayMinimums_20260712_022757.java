// Last updated: 12/07/2026, 02:27:57
1class Solution {
2
3    public int[] nextSmallerOrEqual(int[] arr) {
4        int n = arr.length;
5        int[] nse = new int[n];
6        Arrays.fill(nse, n);
7
8        Deque<Integer> st = new ArrayDeque<>();
9
10        for (int i = 0; i < n; i++) {
11            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
12                nse[st.pop()] = i;
13            }
14            st.push(i);
15        }
16
17        return nse;
18    }
19
20    public int[] prevSmaller(int[] arr) {
21        int n = arr.length;
22        int[] pse = new int[n];
23        Arrays.fill(pse, -1);
24
25        Deque<Integer> st = new ArrayDeque<>();
26
27        for (int i = 0; i < n; i++) {
28            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
29                st.pop();
30            }
31
32            if (!st.isEmpty()) {
33                pse[i] = st.peek();
34            }
35
36            st.push(i);
37        }
38
39        return pse;
40    }
41
42    public int sumSubarrayMins(int[] arr) {
43        final long MOD = 1_000_000_007L;
44        int n = arr.length;
45
46        int[] nse = nextSmallerOrEqual(arr);
47        int[] pse = prevSmaller(arr);
48
49        long ans = 0;
50
51        for (int i = 0; i < n; i++) {
52            long left = i - pse[i];
53            long right = nse[i] - i;
54
55            long contribution =
56                    ((long) arr[i] * left % MOD) * right % MOD;
57
58            ans = (ans + contribution) % MOD;
59        }
60
61        return (int) ans;
62    }
63}
64
65//ans  +=  arr[i] * ((nse[i] - 1) - i + 1) * (i - (pse[i] + 1) + 1) => ans += arr[i] * (nse[i] - i) * (i - pse[i])
66
67//Note: in both left and right contributions, we r condidering
68//arr[i] itself as well that is why we r doing + 1 in both, see above comment