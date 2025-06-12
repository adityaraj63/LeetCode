import java.util.*;
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans = Math.abs(nums[0] - nums[nums.length-1]);
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i-1]);
            ans = Math.max(ans, diff);
        }
        return ans;
    }
}