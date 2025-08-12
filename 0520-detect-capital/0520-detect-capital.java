class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
        }

        if (upperCount == word.length()) return true;
        if (upperCount == 0) return true;
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;
    }
}