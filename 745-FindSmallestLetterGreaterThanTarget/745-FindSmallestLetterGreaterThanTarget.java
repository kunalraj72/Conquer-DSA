// Last updated: 16/10/2025, 04:26:05
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int s = 0;
        int e = n-1;
        char ans = '#';

//Note : we can directly compare the characters, we don't need to convert it
//       number and then compare (See previous 2 submissions also).
        while(s <= e){
            int mid = (s + e)/2;
            if(target == letters[mid]){
                s = mid + 1;
            }
            else if(target > letters[mid]){
                s = mid + 1;
            }
            else if(target < letters[mid]){
                ans = letters[mid];
                e = mid - 1;
            }
        }
        return ans == '#' ? letters[0] : ans;
    }
}