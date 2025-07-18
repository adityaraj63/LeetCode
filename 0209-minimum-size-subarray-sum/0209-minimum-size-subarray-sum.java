class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, minLen = Integer.MAX_VALUE, left = 0, sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
        
        while (sum >= target) {
            minLen = Math.min(minLen, right - left + 1);
            sum -= nums[left];
            left++;
        }
        }
        if (minLen == Integer.MAX_VALUE) return 0;
        else return minLen;               
    }
}