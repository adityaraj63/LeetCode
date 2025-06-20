class Solution {
    public void backTrack(List<List<Integer>> ans, List<Integer> perm, int [] nums) {
        if (perm.size() == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        } 
        for (int i = 0; i < nums.length; i++) {
            if (perm.contains(nums[i])) continue;
            perm.add(nums[i]);
            backTrack(ans, perm, nums);
            perm.remove(perm.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(ans, new ArrayList<>(), nums);
        return ans;       
    }
}