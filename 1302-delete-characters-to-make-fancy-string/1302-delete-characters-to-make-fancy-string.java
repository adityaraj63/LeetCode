class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int len = ans.length();
            if (len >= 2 && ans.charAt(len - 1) == s.charAt(i) && ans.charAt(len - 2) == s.charAt(i)) {
                continue; // skip this character
            }
        ans.append(s.charAt(i));
        }
        return ans.toString();

        
    }
}