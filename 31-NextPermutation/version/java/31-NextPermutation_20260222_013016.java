// Last updated: 22/02/2026, 01:30:16
1class Solution {
2    
3    public void swap(int[] a,int i,int j){
4        int t = a[i];
5        a[i] = a[j];
6        a[j] = t;
7    }
8    
9    public void reverse(int[] a,int i,int j){
10        while( i < j ) swap(a,i++,j--);   
11    }
12    
13    public void nextPermutation(int[] nums) {
14        //See Tech Dose Video for intuition
15        int n = nums.length;
16        int idx1 = -1;
17
18        for(int i = n - 1; i >= 1; i--){
19            if(nums[i] > nums[i - 1]){
20                idx1 = i;
21                break;
22            }
23        }
24
25        if(idx1 == -1){
26            reverse(nums, 0, n - 1); //sorted array
27        }else{
28            int idx2 = idx1;
29            for(int i = idx1 + 1; i < n; i++){
30                if(nums[i] > nums[idx1 - 1]){
31                    idx2 = i;
32                }
33            }
34            swap(nums, idx1 - 1, idx2);
35            reverse(nums, idx1, n - 1);
36        }
37    }
38}
39
40// NOTE: Dry-run on this [1,3,5,4,2], u will understand best (Trick: draw 2 intersecting lines)
41//piche se agar dekhoge toh u will realize ki increasing oreder hai, so idhar reverse karke bhi
42//chota number hi milega, so look where this increasing sequence is breaking (3 in this case (idx1 - 1)),
43//then reverse with it's immediate bigger number(4 (idx2)) and then idx1 to n-1 tak reverse the array.
44//Babbar Notes or TechDose video