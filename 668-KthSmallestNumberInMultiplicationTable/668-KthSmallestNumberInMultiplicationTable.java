// Last updated: 16/10/2025, 04:26:12
class Solution {
    public int findKthNumber(int n, int m, int k) {
        
        int low = 1*1;
        int high = n*m;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(n ,m ,mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int countLessEqual(int n, int m, int mid){

        int row = 0, col = m - 1;
        int count = 0;

        while(row < n && col >= 0){
            if((row + 1) * (col + 1) <= mid){
                count += col + 1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }
}