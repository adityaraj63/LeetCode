class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set <Integer> seen = new HashSet<>();
        int sum = 0, maxSum = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            seen.add(nums[right]);
            sum += nums[right];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;       
    }
}