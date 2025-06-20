class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                ans.add(i);
        }
    }
    return ans;
}
private boolean isSelfDividing(int num) {
        int org = num;
        while (num > 0) {
            int dig = num % 10;
            if (dig == 0 || org % dig != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}