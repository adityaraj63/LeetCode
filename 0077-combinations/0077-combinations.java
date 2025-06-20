class Solution {
    public void backTrack(List<List<Integer>> ans, List<Integer> comb, int start, int n, int k) {
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            backTrack(ans, comb, i+1, n, k);
            comb.remove(comb.size() - 1);
        }       
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(ans, new ArrayList<>(), 1, n , k);
        return ans;
        
    }
}