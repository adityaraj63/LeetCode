class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return " ";
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(),s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));               
            }else {
                break;
            }
        }
        return sb.toString();
    }
}