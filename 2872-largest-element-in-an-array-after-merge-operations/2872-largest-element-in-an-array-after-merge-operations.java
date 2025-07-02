class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long sum = nums[n-1];
        long max = sum;

        for (int i = n-2; i >= 0; i--) {
            if (nums[i] <= sum) sum += nums[i];
            else sum = nums[i];
            max = Math.max(max, sum);
        }
        return max;      
    }
}