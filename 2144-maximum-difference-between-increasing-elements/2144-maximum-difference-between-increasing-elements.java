class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int diff = nums[j] - nums[i];                  
                    maxDiff = Math.max(diff, maxDiff);
                } 
            }
        }
        if (maxDiff <= 0) return -1;
        return maxDiff;       
    }
}