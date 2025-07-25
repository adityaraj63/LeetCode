class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int xcopyy = x;
        while (x > 0) {
            rev = (rev*10) + (x%10);
            x /= 10;
        }
        if (rev != xcopyy) return false;
        else return true;
    }
}