class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, cnt = 0;
        int i = 0, j = n-1;
        
        while (i < j) {
            cnt += nums[j] - nums[i];
            i++; j--;
        }
        return cnt;       
    }
}