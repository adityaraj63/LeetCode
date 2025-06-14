import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ans = new HashSet<>();
        while (n != 1 && !ans.contains(n)) {
            ans.add(n);
            n = getSquare(n);
        }
        return n == 1;
    }
    private int getSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;       
    }
}