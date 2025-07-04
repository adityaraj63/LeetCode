class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;
        double hourAngle = hour * 30 + (double)minutes / 2;
        double minuteAngle = minutes * 6;
        double ans = (double)(Math.abs(hourAngle - minuteAngle));
        if (ans > 180) ans = 360 - ans;
        return ans;        
    }
}