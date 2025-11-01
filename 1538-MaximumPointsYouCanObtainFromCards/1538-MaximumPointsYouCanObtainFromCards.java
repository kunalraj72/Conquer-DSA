// Last updated: 01/11/2025, 09:17:33
class Solution {
    //This problem can be solved by finding the least sum subarray of size n - k, 
    //the answer is sum of elements outside of that window.
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int i = 0;
        int j = 0;
        long arrSum = Arrays.stream(cardPoints).sum();
        long sum = 0;
        long leastSum = Long.MAX_VALUE;

        int targetLen = n - k;

        while(j < n){
            sum += cardPoints[j];
            if(j - i + 1 > targetLen){
                while(j - i + 1 > targetLen && i <= j){
                    sum -= cardPoints[i++];
                }
            }
            if(j - i + 1 == targetLen){
                leastSum = Math.min(sum, leastSum);
            }
            j++;
        }
        return (int) (arrSum - leastSum);

        
    }
}