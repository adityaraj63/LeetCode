class Solution {
    public int jump(int[] nums) {
        int totalJump = 0, maxReach = 0, jumpEnd = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxReach = Math.max(maxReach, i+nums[i]);
            if (i == jumpEnd) {
                totalJump++;
                jumpEnd = maxReach;
            }
        }
        return totalJump;       
    }
}