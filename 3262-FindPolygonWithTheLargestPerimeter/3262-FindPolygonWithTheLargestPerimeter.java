// Last updated: 16/10/2025, 04:23:46
import java.util.Arrays;
public class Solution {    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);        int idsuh = 0;
        long ullu = 0, curr = 0;        ullu = 1L * (nums[0] + nums[1]);
        idsuh = 2;
        for (int ahj = 2; ahj < nums.length; ahj++) {            if (1L * nums[ahj] < ullu) {
                ullu += 1L * nums[ahj];                curr = ullu;
                idsuh++;            } else {
                ullu += 1L * nums[ahj];            }
        }
        if (idsuh == 2) {            return -1;
        }
        return curr;    }
}

