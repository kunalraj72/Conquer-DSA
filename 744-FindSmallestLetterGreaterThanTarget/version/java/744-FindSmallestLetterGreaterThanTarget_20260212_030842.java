// Last updated: 12/02/2026, 03:08:42
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int n = letters.length;
4        int s = 0;
5        int e = n-1;
6        char ans = '#';
7
8//Note : we can directly compare the characters, we don't need to convert it
9//       number and then compare (See previous 2 submissions also).
10        while(s <= e){
11            int mid = (s + e)/2;
12            if(target == letters[mid]){
13                s = mid + 1;
14            }
15            else if(target > letters[mid]){
16                s = mid + 1;
17            }
18            else if(target < letters[mid]){
19                ans = letters[mid];   //we r simply finding ceil here
20                e = mid - 1;
21            }
22        }
23        return ans == '#' ? letters[0] : ans;
24    }
25}