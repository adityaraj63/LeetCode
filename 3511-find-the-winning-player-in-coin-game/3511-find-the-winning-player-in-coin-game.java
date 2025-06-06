class Solution {
    public String winningPlayer(int x, int y) {
        int maxTurn = Math.min(x,y / 4);
        if (maxTurn % 2 == 1) return "Alice";
        else return "Bob";
    }
}