class Solution {
    public int reverse(int x) {
        long rev = 0;
        int copy = x;
        x = Math.abs(x);
        while (x != 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10;
        }
        if(rev<Integer.MIN_VALUE|| rev>Integer.MAX_VALUE) return 0;
        else if(copy<0) return -(int)rev;
        return (int)rev;        
    }
}